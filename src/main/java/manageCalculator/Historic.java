package manageCalculator;

import java.util.ArrayList;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class Historic implements Serializable {
	
	private static final long serialVersionUID = -282702558525389183L;
	private ArrayList<ExpressionC> list;

	public Historic() {
		list = new ArrayList<>();
	}

	public ArrayList<ExpressionC> getList() {
		return list;
	}

	public void addToList(ExpressionC e) {
		list.add(e);
	}

}
