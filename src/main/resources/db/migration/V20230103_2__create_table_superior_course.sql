CREATE TABLE if not exists superior_couse (
  id BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
   cid VARCHAR(20),
   institution VARCHAR(80),
   course VARCHAR(80),
   status VARCHAR(50),
   conclusionYear date,
   CONSTRAINT pk_superior_couse PRIMARY KEY (id)
);