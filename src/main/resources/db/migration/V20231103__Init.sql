create type post_state as enum ('DRAFT', 'FAIR');

create sequence post_id_seq;

create table post
(
    id        bigint primary key,
    author_id uuid        not null,
    created   timestamptz not null default now(),
    modified  timestamptz not null default now(),
    state     post_state  not null,
    raw       text        not null
);
