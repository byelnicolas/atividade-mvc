package mvc.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.model.AlunoMediaModel;
import mvc.view.AlunoMediaView;

public class AlunoMediaController {

	private AlunoMediaView view;
	private AlunoMediaModel model;

	public AlunoMediaController(AlunoMediaView view, AlunoMediaModel model) {
		super();
		this.view = view;
		this.model = model;

		this.view.AlunoMediaListener(new AlunoMediaListener());
	}

	class AlunoMediaListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {

			int nota1, nota2, nota3, nota4 = 0;

			try {
				nota1 = view.getNota1();
				nota2 = view.getNota2();
				nota3 = view.getNota3();
				nota4 = view.getNota4();
				model.somar(nota1, nota2, nota3, nota4);
				int media = model.retornarResultado();
				view.setResultado(media);

				if (media >= 6) {
					view.displayErrorMessage("aprovado");

				} else {
					view.displayErrorMessage("reprovado");
				}
			} catch (NumberFormatException ex) {
				view.displayErrorMessage("letras não são permitidas");
			}
		}
	}
}
