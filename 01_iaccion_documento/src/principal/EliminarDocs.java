package principal;

import org.bson.Document;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class EliminarDocs {

	public static void main(String[] args) {
		//conexión con el servidor Mongo DB
		MongoClient mongo=new MongoClient("localhost", 27017);
		//obtención de referencia a BD
		MongoDatabase db=mongo.getDatabase("pruebas");
		//obtenemos la colección de documentos
		MongoCollection<Document> col=db.getCollection("empleados");
		//filtro
		BasicDBObject ob=new BasicDBObject("salario", new BasicDBObject("$gte",3000));
		col.deleteMany(ob);

	}

}
