drop database Reddit;
create database Reddit;
use Reddit;

create table Posts (
                       id INT NOT NULL AUTO_INCREMENT,
                       title VARCHAR(50) ,
                       autor VARCHAR(50) ,
                       content VARCHAR(250) ,
                       post_date TIMESTAMP,

                       PRIMARY KEY (id)
);
create table Comments (
                          id INT NOT NULL AUTO_INCREMENT,
                          autor VARCHAR(50) ,
                          content VARCHAR(250) ,
                          comment_date TIMESTAMP,
                          likes INT,
                          post_id INT ,
                          PRIMARY KEY (id),
                          FOREIGN KEY (post_id) REFERENCES Posts(id)
);

COMMIT;

insert into Posts (title, autor, content, post_date) values
                                                         ("Domina JavaScript en 24 horas", "Carlos", "Si no lo logras en 24 horas, intenta con café... mucho café.", '2024-10-25 10:00:00'),
                                                         ("Haciendo un robot con cartón", "Sofía", "Es más un amigo que un robot, pero se mueve... con ayuda de un ventilador.", '2024-10-25 11:00:00'),
                                                         ("El arte de procrastinar", "Martín", "Postergar es un arte, y yo soy un maestro. Aquí te enseño cómo evitar cualquier cosa.", '2024-10-25 12:00:00'),
                                                         ("Sobrevivir a reuniones inútiles", "Jorge", "Siempre lleva una botella de agua y pon cara de que estás tomando notas.", '2024-10-25 13:00:00'),
                                                         ("Cómo instalar Linux en tu tostadora", "Lucas", "No estoy seguro de por qué lo hice, pero ahora mi pan sale perfectamente dorado.", '2024-10-25 14:00:00'),
                                                         ("Guía definitiva de memes", "Valeria", "Desde el 'Doge' hasta el 'Distracted Boyfriend'. No te quedes atrás.", '2024-10-25 15:00:00'),
                                                         ("Hackear tu vida en 5 pasos", "Lina", "Paso 1: Duerme más. Paso 2: Acepta que no harás nada de la lista.", '2024-10-25 16:00:00'),
                                                         ("Curso intensivo de siestas", "Alberto", "Todos subestiman el poder de una buena siesta. Aquí está la guía definitiva.", '2024-10-25 17:00:00'),
                                                         ("Cómo fingir que sabes programar", "Laura", "Solo di 'funciona en mi máquina' y asiente cuando alguien mencione Java.", '2024-10-25 18:00:00'),
                                                         ("La guía definitiva para evitar spoilers", "Erick", "Paso 1: Desactiva internet. Paso 2: Cambia de planeta.", '2024-10-25 19:00:00'),
                                                         ("Cómo usar Excel para hacer magia", "Beatriz", "Con macros, gráficos y un poco de suerte, te verás como un verdadero mago.", '2024-10-25 20:00:00'),
                                                         ("10 maneras de romper tu aplicación en producción", "David", "Una de ellas es olvidar cerrar un paréntesis... es increíblemente efectivo.", '2024-10-25 21:00:00'),
                                                         ("Cómo convertir café en código", "María", "He descubierto que entre la taza 3 y 4, escribo como Shakespeare.", '2024-10-25 22:00:00'),
                                                         ("Tu gato también puede ser programador", "Daniel", "Solo necesita acceso a tu teclado. Prepárate para sorpresas en el código.", '2024-10-25 23:00:00');

select id, title, autor, post_date, content
from Posts
    COMMIT;

insert into Comments (
    autor, content, comment_date, likes, post_id
) values
      ("Ana", "Este post cambió mi vida, gracias por compartirlo.", '2024-10-25 10:30:00', 5, 1),
      ("Carlos", "No entiendo nada, ¿puedes explicarlo mejor?", '2024-10-25 11:15:00', 2, 1),
      ("Sofía", "¿Alguien más probó esto y le funcionó? Me gustaría saber.", '2024-10-25 11:45:00', 3, 1),
      ("Jorge", "Es un enfoque interesante, ¿alguna recomendación adicional?", '2024-10-25 12:30:00', 1, 2),
      ("Valeria", "Me encantó el concepto, ¡hay que intentarlo!", '2024-10-25 15:30:00', 4, 6),
      ("Lina", "Siempre he querido hacer algo así, gracias por la idea.", '2024-10-25 16:45:00', 7, 7);
/*select p.id, p.title, p.autor, p.post_date
from Posts p
join Comments c
on p.id = c.post_id
where c.post_id = 1;(/