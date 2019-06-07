package view;

import javax.swing.JOptionPane;

import model.Professor;

public class Execucao {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Professor professor = new Professor();
		
		professor.setNome(JOptionPane.showInputDialog(null, "Nome:" ));
		professor.setEndereco(JOptionPane.showInputDialog(null, "Endereço:" ));
		professor.setBairro(JOptionPane.showInputDialog(null, "Bairro:" ));
		professor.setCep(Integer.parseInt(JOptionPane.showInputDialog(null, "Cep:" )));
		professor.setCidade(JOptionPane.showInputDialog(null, "Cidade:" ));
		professor.setEstado(JOptionPane.showInputDialog(null, "Estado:" ));
		professor.setRg(Long.parseLong(JOptionPane.showInputDialog(null, "RG:" )));
		professor.setCpf(Long.parseLong(JOptionPane.showInputDialog(null, "CPF:" )));
		int ndisciplina;
	
	try {
		int dis = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas disciplinas você possui?"));
		String disciplinas[] = new String[100];
		for (int i = 0; i < dis; i++) {
			disciplinas[i] = JOptionPane.showInputDialog(null, "Digite a disciplina: " +(i + 1));
		}
		professor.setDisciplinas(disciplinas);
		} catch (Exception e) {
			e.printStackTrace();
		}
	try {
		int cur = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos cursos você possui?"));
		String cursos[] = new String[100];
		for (int i = 0; i < cur; i++) {
			ndisciplina = i;
			cursos[i] = JOptionPane.showInputDialog(null, "Digite o curso: " +(i + 1));	
		}
		professor.setCursos(cursos);
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	professor.getNome();
	System.out.println(professor.getNome());
	
	System.out.println(professor.getEndereco());
	
	System.out.println(professor.getBairro());
	
	System.out.println(professor.getCep());
	
	System.out.println(professor.getCidade());
	
	System.out.println(professor.getEstado());
	
	System.out.println(professor.getRg());
	
	System.out.println(professor.getCpf());
	
	System.out.println(professor.getCursos());
	
	System.out.println(professor.getDisciplinas());
	}

}
