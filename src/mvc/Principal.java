package mvc;

import mvc.controller.AlunoMediaController;
import mvc.model.AlunoMediaModel;
import mvc.view.AlunoMediaView;

public class Principal {
	public static void main(String[] args) {

		AlunoMediaView view = new AlunoMediaView();
		AlunoMediaModel model = new AlunoMediaModel();
		AlunoMediaController controller = new AlunoMediaController(view, model);

		// exibir formulário
		view.setVisible(true);
	}
}
