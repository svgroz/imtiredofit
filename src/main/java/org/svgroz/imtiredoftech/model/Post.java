package org.svgroz.imtiredoftech.model;

import java.time.OffsetDateTime;
import java.time.ZonedDateTime;

public record Post(
    PostId id,
    UserId authorId,
    OffsetDateTime created,
    OffsetDateTime modified,
    PostState state,
    String raw) {}
