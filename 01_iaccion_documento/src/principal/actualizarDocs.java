package principal;

import org.bson.Document;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class actualizarDocs {

	public static void main(String[] args) {
		//conexi�n con el servidor Mongo DB
		MongoClient mongo=new MongoClient("localhost", 27017);
		//obtenci�n de referencia a BD
		MongoDatabase db=mongo.getDatabase("pruebas");
		//obtenemos la colecci�n de documentos
		MongoCollection<Document> col=db.getCollection("empleados");
		//filtro
		BasicDBObject obFiltro=new BasicDBObject("nombre", "maria");
		//datos
		BasicDBObject obDatos=new BasicDBObject("salario", 1800);
		//actualizaci�n
		col.updateMany(obFiltro, obDatos);
	}

}
