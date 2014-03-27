package my.spring.rest.consume;

import org.springframework.web.client.RestTemplate;

/**
 * Max Titov 3/21/14 6:18 PM
 */
public class RestConsumer {

    public static void main(String args[]) {
        RestTemplate restTemplate = new RestTemplate();
        Page page = restTemplate.getForObject("http://graph.facebook.com/gopivotal", Page.class);
        System.out.println("Name:    " + page.getName());
        System.out.println("About:   " + page.getAbout());
        System.out.println("Phone:   " + page.getPhone());
        System.out.println("Website: " + page.getWebsite());
    }

}
