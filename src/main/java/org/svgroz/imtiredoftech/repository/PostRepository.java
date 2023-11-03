package org.svgroz.imtiredoftech.repository;

import java.sql.Types;
import java.time.OffsetDateTime;
import java.util.Optional;
import java.util.UUID;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.stereotype.Repository;
import org.svgroz.imtiredoftech.model.Post;
import org.svgroz.imtiredoftech.model.PostId;
import org.svgroz.imtiredoftech.model.PostState;
import org.svgroz.imtiredoftech.model.UserId;

@Repository
public class PostRepository {
  private final JdbcOperations jdbcOperations;

  public PostRepository(JdbcOperations jdbcOperations) {
    this.jdbcOperations = jdbcOperations;
  }

  public Optional<Post> findPostById(PostId id) {
    var res =
        jdbcOperations.query(
            "select id, author_id, created, modified, state, raw from post where id = ?",
            new Object[] {id.value()},
            new int[] {Types.BIGINT},
            (rs, i) ->
                new Post(
                    new PostId(rs.getLong(1)),
                    new UserId(rs.getObject(2, UUID.class)),
                    rs.getObject(3, OffsetDateTime.class),
                    rs.getObject(4, OffsetDateTime.class),
                    PostState.valueOf(rs.getString(5)),
                    rs.getString(6)));

    return res.isEmpty() ? Optional.empty() : Optional.of(res.get(0));
  }
}
