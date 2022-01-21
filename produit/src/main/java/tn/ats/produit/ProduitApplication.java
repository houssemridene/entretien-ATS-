package tn.ats.produit;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.catalina.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import tn.ats.produit.entity.Produit;
import tn.ats.produit.repository.ProduitRepository;
import tn.ats.produit.service.ProduitService;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@SpringBootApplication
public class ProduitApplication  {

	public static void main(String[] args) {
		SpringApplication.run(ProduitApplication.class, args);
	}
@Bean
	CommandLineRunner runner(ProduitRepository userService) {
		return args -> {
			// read json and write to db
			ObjectMapper mapper = new ObjectMapper();
			TypeReference<List<Produit>> typeReference = new TypeReference<List<Produit>>(){};
			InputStream inputStream = TypeReference.class.getResourceAsStream("/produit.json");
			try {

				List<Produit> users = mapper.readValue(inputStream,typeReference);
				for (Produit produit :users){
					userService.save(produit);
				}

				System.out.println("Users Saved!");
			} catch (IOException e){
				System.out.println("Unable to save users: " + e.getMessage());
			}
		};
	}

}
