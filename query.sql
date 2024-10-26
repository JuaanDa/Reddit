drop database Reddit;
create database Reddit;
use Reddit;

create table Posts (
 id INT NOT NULL AUTO_INCREMENT,
 title VARCHAR(50) NOT NULL,
 autor VARCHAR(50) NOT NULL,
 content VARCHAR(255) NOT NULL,
 post_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,a

 PRIMARY KEY (id)
);
create table Comments (
 id INT NOT NULL AUTO_INCREMENT,
 autor VARCHAR(50) NOT NULL,
 content VARCHAR(250) NOT NULL,
 comment_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
 likes INT DEFAULT 0,
 post_id INT NOT NULL,
 PRIMARY KEY (id),
 FOREIGN KEY (post_id) REFERENCES Posts(id)
);

COMMIT;

insert into
Posts (
    title, autor, content
) values
("Domina JavaScript en 24 horas", "Carlos", "Si no lo logras en 24 horas, intenta con café... mucho café."),
("Haciendo un robot con cartón", "Sofía", "Es más un amigo que un robot, pero se mueve... con ayuda de un ventilador."),
("El arte de procrastinar", "Martín", "Postergar es un arte, y yo soy un maestro. Aquí te enseño cómo evitar cualquier cosa."),
("Sobrevivir a reuniones inútiles", "Jorge", "Siempre lleva una botella de agua y pon cara de que estás tomando notas."),
("Cómo instalar Linux en tu tostadora", "Lucas", "No estoy seguro de por qué lo hice, pero ahora mi pan sale perfectamente dorado."),
("Guía definitiva de memes", "Valeria", "Desde el 'Doge' hasta el 'Distracted Boyfriend'. No te quedes atrás."),
("Hackear tu vida en 5 pasos", "Lina", "Paso 1: Duerme más. Paso 2: Acepta que no harás nada de la lista."),
("Curso intensivo de siestas", "Alberto", "Todos subestiman el poder de una buena siesta. Aquí está la guía definitiva."),
("Cómo fingir que sabes programar", "Laura", "Solo di 'funciona en mi máquina' y asiente cuando alguien mencione Java."),
("La guía definitiva para evitar spoilers", "Erick", "Paso 1: Desactiva internet. Paso 2: Cambia de planeta."),
("Cómo usar Excel para hacer magia", "Beatriz", "Con macros, gráficos y un poco de suerte, te verás como un verdadero mago."),
("10 maneras de romper tu aplicación en producción", "David", "Una de ellas es olvidar cerrar un paréntesis... es increíblemente efectivo."),
("Cómo convertir café en código", "María", "He descubierto que entre la taza 3 y 4, escribo como Shakespeare."),
("Tu gato también puede ser programador", "Daniel", "Solo necesita acceso a tu teclado. Prepárate para sorpresas en el código.");

select id, title, autor, post_date, content
from Posts
COMMIT;

insert into
Comments (
    autor, content, post_id
) values
("Ana", "Este post cambió mi vida, gracias.", 1),
("Carlos", "No entiendo nada, ¿puedes explicarlo mejor?", 1),
("Sofía", "¿Alguien más probó esto y le funcionó?", 1);

/*select p.id, p.title, p.autor, p.post_date
from Posts p
join Comments c
on p.id = c.post_id
where c.post_id = 1;(/