package be.vdab.evaluationapp.controller;

import be.vdab.evaluationapp.model.Trainee;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.http.*;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.client.RestTemplate;

import java.awt.print.Book;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@WebAppConfiguration
// @ActiveProfiles("dev")
public class EvaluationWebTest {

    // Server moet draaien : Dus eerst starten !
    private static final String URL = "http://localhost:8080/evaluations";
    private RestTemplate template;

    @Before
    public void init() {
        template = new RestTemplate();
    }

    @Test
    public void testAddAnswer() {
        HttpHeaders headers = new HttpHeaders(); // opgeven welk formaat we gaan meegeven !
        headers.setContentType(MediaType.APPLICATION_JSON); // we geven Json formaat mee in de body.

        String jsonEvaluation =
                "{\"answer\" : \"Computer says no?\", \"traineeid\" : 1, \"questiontypeid\" : 2, \"instructorid\" : 1, \"courseid\" : 1, \"answertypeid\" : 2}";
//                "[{\"answer\" : \"Computer says no?\", \"traineeid\" : 1, \"questiontypeid\" : 1, \"instructorid\" : 1, \"courseid\": 1, \"answertypeid\" : 3},\n" +
//                " {\"id\" : null, \"date\" : null,\"answer\" : \"2\", \"traineeid\" : 1, \"questiontypeid\" : 3, \"instructorid\" :1,\"courseid\": 1, \"answertypeid\" : 1},\n" +
//                " {\"id\" : null, \"date\" : null,\"answer\" : \"3\", \"traineeid\" : 1, \"questiontypeid\" : 3, \"instructorid\" :1,\"courseid\": 1, \"answertypeid\" : 1}]";

        //"[{\"firstname\":\"Jean\",\"name\":\"Baptist\",\"email\":\"jean@baptist.be\",\"phonenumber\":\"011223121\",\"companyname\":BP,\"jobrole\":concierge\"}{\"firstname\":\"René\",\"name\":Thijs\"}{\"question\":\"Is 't eten nog nie gereed?\",\"questiontypeid\":1\",\"answertypeid\":2\"}{\"questiontypeid\":\"1\",\"answertypeid\":2\",\"instructorid\":2\",\"traineeid\":\"1\",\"instructorcourseid\":2\",\"answer\":\"Bijna!\"}]";

        HttpEntity<String> data = new HttpEntity<>(jsonEvaluation, headers);

        ResponseEntity<Integer> responseEntity = template.postForEntity(URL, data, Integer.class);
        assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(responseEntity.getBody()).isEqualTo(1);
    }

/*
    @Test
    public void testAddTrainee() {
//        RestTemplate template = new RestTemplate(); // als je meerdere methodes hebt doe je dit in @Before
        ResponseEntity<List> responseEntity = template.getForEntity(URL, List.class);
        assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
//        assertThat(responseEntity.getBody()).hasSize(4); // of .isNotEmpty() als je niet weet hoeveel rijen in de tabel zitten
        assertThat(responseEntity.getBody()).isNotNull(); // of .isNotEmpty() als je niet weet hoeveel rijen in de tabel zitten

        ObjectMapper objectMapper = new ObjectMapper();
        ResponseEntity<String> jsonString = template.getForEntity(URL, String.class);

        try {
            JsonNode jsonNode = objectMapper.readTree(jsonString.getBody());
            assertThat(jsonNode.toString()).isEqualTo("[" +
            "{\"firstname\":\"Jean\",\"name\":\"Baptist\",\"email\":\"jean@baptist.be\",\"phonenumber\":\"011223121\"," +
            "\"companyname\":BP,\"jobrole\":concierge\"}" +
            "]");
        } catch (IOException e) {
            e.printStackTrace();
        }
*/

/* no methods to read from eval DB implemented yet ; please check results in mySQL
        String result = template.getForObject(URL_FIND_ALL, String.class);
        try {
            List<Book> allBooks = new ArrayList<>();

            JSONArray array = new JSONArray(jsonString.getBody());
            for (int i = 0; i < array.length(); i++) {
                JSONObject jsonBook = array.getJSONObject(i);

                Trainee myTrainee = new Trainee();
                myTrainee.setFirstname(myTrainee.getString("firstname"));
                myTrainee.setAuthor(myTrainee.getString("author"));
                myTrainee.setId(myTrainee.getInt("id"));

                allBooks.add(myTrainee);
            }
            assertThat(allBooks).isNotEmpty();

            Book myFirstTrainee = allBooks.get(0);
            assertThat(myFirstTrainee.getId()).isEqualTo(1);
            assertThat(myFirstTrainee.getAuthor()).isEqualTo("J.K. Rowling");
            assertThat(myFirstTrainee.getTitle()).isEqualTo("The lost stone");


        } catch (JSONException e) {
            e.printStackTrace();
        }
*/
}

