create sequence hibernate_sequence start with 1 increment by 1;

insert into client (client_id,user_name,created_at,updated_at,version)
values (hibernate_sequence, 'client-1', CURRENT_DATE, CURRENT_DATE, 0),
       (hibernate_sequence, 'client-2', CURRENT_DATE, CURRENT_DATE, 0),
       (hibernate_sequence, 'client-3', CURRENT_DATE, CURRENT_DATE, 0),
       (hibernate_sequence, 'client-4', CURRENT_DATE, CURRENT_DATE, 0),
       (hibernate_sequence, 'client-5', CURRENT_DATE, CURRENT_DATE, 0),
       (hibernate_sequence, 'client-6', CURRENT_DATE, CURRENT_DATE, 0),
       (hibernate_sequence, 'client-7', CURRENT_DATE, CURRENT_DATE, 0),
       (hibernate_sequence, 'client-8', CURRENT_DATE, CURRENT_DATE, 0),
       (hibernate_sequence, 'client-9', CURRENT_DATE, CURRENT_DATE, 0),
       (hibernate_sequence, 'client-10', CURRENT_DATE, CURRENT_DATE, 0);

