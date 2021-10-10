package software.robsoncassiano.learn.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import software.robsoncassiano.learn.models.entities.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
}
