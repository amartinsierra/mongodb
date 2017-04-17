package principal;

import java.util.HashMap;
import java.util.Map;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;


//commit 4444
//commit 55555555
//commit 6666666
//commit 77777
//Commit 8888888
//commit 99999999
//commit 101010
public class InsertarDoc {

	public static void main(String[] args) {
		//conexión con el servidor Mongo DB
		MongoClient mongo=new MongoClient("localhost", 27017);
		//obtención de referencia a BD
		MongoDatabase db=mongo.getDatabase("pruebas");
		//obtenemos la colección de documentos
		MongoCollection<Document> col=db.getCollection("empleados");
		//creamos documento con sus claves y valores
		//y lo añadimos documento a la colección
		Map<String,Object> jsonDoc=new HashMap<>();
		/*jsonDoc.put("nombre", "anita");
		jsonDoc.put("salario", 2340);*/
		jsonDoc.put("nombre", "Elena");
		jsonDoc.put("salario", 1500);
		Document doc=new Document(jsonDoc);
		
		
		col.insertOne(doc);
		
		
		System.out.println("documento añadido!!");
		
		

	}

}
