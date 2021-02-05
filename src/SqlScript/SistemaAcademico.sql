create database SistemaAcademico;

use SistemaAcademico;


create table Usuario(
	numero int not null,
	nome varchar(64) not null,
	login varchar(32) not null unique,
	senha varchar(8) not null,
	perfil varchar(32) not null,
	primary key(numero)
);

create table Professor(
	numero int not null,
	titulacao varchar(32),
	primary key(numero),

	constraint FK_Professor
		foreign key(numero) references Usuario(numero)
			on delete cascade on update cascade
);
			
create table Aluno(
	numero int not null,
	curso varchar(64),
	primary key(numero),
	constraint FK_Aluno
		foreign key(numero) references Usuario(numero)
			on delete cascade on update cascade
);
			
create table Disciplina(
	codigo int not null,
	nome varchar(32),
	credito int,
	primary key(codigo)
);
		
create table Turma(
	id int not null,
	semestre int,
	ano int,
	numProfessor int not null,
	codDisciplina int not null,
	primary key(id),
	
	constraint FK_Turma_Professor
		foreign key(numProfessor) references Professor(numero)
			on update cascade,
	constraint FK_Turma_Disciplina
		foreign key(codDisciplina) references Disciplina(codigo)
			on update cascade
);
			
create table Matricula(
	numAluno int not null,
	idTurma int not null,
	nota1 int,
	nota2 int,
	exame int,
	faltas int,

	constraint PK_Matricula
		primary key(numAluno, idTurma),
	constraint FK_Matricula_Aluno
		foreign key(numAluno) references Aluno(numero)
			on delete cascade on update cascade,
	constraint FK_Id_Turma
		foreign key(idTurma) references Turma(id)
			on delete cascade on update cascade
);       

