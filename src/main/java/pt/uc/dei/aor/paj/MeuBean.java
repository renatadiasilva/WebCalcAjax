package pt.uc.dei.aor.paj;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class MeuBean implements Serializable {

	private static final long serialVersionUID = 6701185573429981692L;
	private String panel1 = "Hide-Panel1";
	
	private String texto;

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	public void dizOla() {
		texto = "Olá";
	}
	
		public void setPanel1(String panel1){
		this.panel1 = panel1;
		}

		public String getPanel1(){
		return this.panel1;
		}

//	(botõezinhos)
//	<h:form>
//    <h:panelGrid columns="3" cellpadding="5">
//        <h:outputText value="KeyUp: " />
//        <p:inputText id="firstname" value="#{userView.firstname}">
//            <p:ajax event="keyup" update="out1" />
//        </p:inputText>
//        <h:outputText id="out1" value="#{userView.firstname}" />
// 
//        <h:outputText value="Blur: " />
//        <p:inputText id="surname" value="#{userView.lastname}">
//            <p:ajax event="blur" update="out2" />
//        </p:inputText>
//        <h:outputText id="out2" value="#{userView.lastname}" />
//    </h:panelGrid>
//</h:form>
	
	
	
	
}
