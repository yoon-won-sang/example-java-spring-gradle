package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;
import java.util.Arrays;
import java.util.List;

@Controller
public class GridController {

    @GetMapping("/grid-view")
    public String grid(Model model) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://jsonplaceholder.typicode.com/posts";

        Post[] postsArray = restTemplate.getForObject(url, Post[].class);
        List<Post> posts = (postsArray != null) ? Arrays.asList(postsArray) : null;
        int limit = 30;
        List<Post> displayPosts = (posts != null && posts.size() > limit) ? posts.subList(0, limit) : posts;

        model.addAttribute("posts", displayPosts);
        return "grid";
    }
}
