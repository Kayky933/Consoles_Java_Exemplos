import java.text.SimpleDateFormat;
import entities.*;

public class App {
    public static void main(String[] args) throws Exception {
       SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment c1 = new Comment("Tenha uma boa viagem!");
		Comment c2 = new Comment("Que legal!");
		Post p1 = new Post(
				sdf.parse("21/06/2018 13:05:44"), 
				"Viajando para Japão", 
				"Estou indo visitar o Japão, aprender mais sobre uma nova cultura e conhecer novas pessoas!", 
				12);
		p1.addComment(c1);
		p1.addComment(c2);
		
		Comment c3 = new Comment("Boa noite");
		Comment c4 = new Comment("Olá, tudo bem?");
		Post p2 = new Post(
				sdf.parse("28/07/2018 23:14:19"), 
				"Boa noite gente", 
				"Vejo vocês amanhã", 
				5);
		p2.addComment(c3);
		p2.addComment(c4);
		
		System.out.println(p1);
		System.out.println(p2);
    }
}
