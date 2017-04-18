package principal;

import org.bson.Document;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

public class LeerFiltro {

	public static void main(String[] args) {
		//conexión con el servidor Mongo DB
				MongoClient mongo=new MongoClient("localhost", 27017);
				//obtención de referencia a BD
				MongoDatabase db=mongo.getDatabase("pruebas");
				//obtenemos la colección de documentos
				MongoCollection<Document> col=db.getCollection("empleados");
				//filtro
				BasicDBObject ob=new BasicDBObject("salario", new BasicDBObject("$gt",2000));
				//recogemos un FindIterable para recorrer los documentos
				FindIterable<Document> cursor=col.find(ob);
				//Obtenemos un MongoCursor para recorrer todos los documentos
				MongoCursor<Document> iter=cursor.iterator();
				while(iter.hasNext()){
					System.out.println(iter.next().get("nombre"));
				}

	}

}
