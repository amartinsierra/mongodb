package principal;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

///cambio 1
public class LeerDocs {

	public static void main(String[] args) {
		//conexión con el servidor Mongo DB
				MongoClient mongo=new MongoClient("localhost", 27017);
				//obtención de referencia a BD
				MongoDatabase db=mongo.getDatabase("pruebas");
				//obtenemos la colección de documentos
				MongoCollection<Document> col=db.getCollection("empleados");
				//recogemos un FindIterable para recorrer los documentos
				FindIterable<Document> cursor=col.find();
				//Obtenemos un MongoCursor para recorrer todos los documentos
				MongoCursor<Document> iter=cursor.iterator();
				while(iter.hasNext()){
					Document doc=iter.next();
					System.out.println(doc.get("nombre")+" " + doc.get("salario"));
				}

	}

}
