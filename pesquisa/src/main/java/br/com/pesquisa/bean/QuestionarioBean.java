package br.com.pesquisa.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import br.com.pesquisa.dao.GenericDao;
import br.com.pesquisa.model.Q01;
import br.com.pesquisa.model.Q02;
import br.com.pesquisa.model.Q03;
import br.com.pesquisa.model.Q04;
import br.com.pesquisa.model.Q05;
import br.com.pesquisa.model.Q06;
import br.com.pesquisa.model.Q07;
import br.com.pesquisa.model.Q08;
import br.com.pesquisa.model.Q09;
import br.com.pesquisa.model.Q10;
import br.com.pesquisa.model.Q11;
import br.com.pesquisa.model.Q12;
import br.com.pesquisa.model.Q13;
import br.com.pesquisa.model.Q14;
import br.com.pesquisa.model.Q15;
import br.com.pesquisa.model.Q16;
import br.com.pesquisa.model.Q17;
import br.com.pesquisa.model.Q18;
import br.com.pesquisa.model.Q19;
import br.com.pesquisa.model.Q20;
import br.com.pesquisa.model.Q21;
import br.com.pesquisa.model.Q22;
import br.com.pesquisa.model.Q23;
import br.com.pesquisa.model.Q24;
import br.com.pesquisa.model.Q25;
import br.com.pesquisa.model.Q26;
import br.com.pesquisa.model.Q27;
import br.com.pesquisa.model.Q28;
import br.com.pesquisa.model.Q29;

@ManagedBean
@ViewScoped
public class QuestionarioBean implements Serializable {

	private static final long serialVersionUID = 1246209766903997401L;
	private int barra;

	private int altQ1;
	private int altQ2;
	private int altQ3;
	private int altQ4;
	private int altQ5;
	private int altQ6;
	private int altQ7;
	private int altQ8;
	private int altQ9;
	private int altQ10;
	private int altQ11;
	private int altQ12;
	private int altQ13;
	private int altQ14;
	private int altQ15;
	private int altQ16;
	private int altQ17;
	private int altQ18;
	private int altQ19;
	private int altQ20;
	private int altQ21;
	private int altQ22;
	private int altQ23;
	private int altQ24;
	private int altQ25;
	private int altQ26;
	private int altQ27;
	private int altQ28;
	private String comentarios;

	// Classes
	private Q01 q1;
	private Q02 q2;
	private Q03 q3;
	private Q04 q4;
	private Q05 q5;
	private Q06 q6;
	private Q07 q7;
	private Q08 q8;
	private Q09 q9;
	private Q10 q10;
	private Q11 q11;
	private Q12 q12;
	private Q13 q13;
	private Q14 q14;
	private Q15 q15;
	private Q16 q16;
	private Q17 q17;
	private Q18 q18;
	private Q19 q19;
	private Q20 q20;
	private Q21 q21;
	private Q22 q22;
	private Q23 q23;
	private Q24 q24;
	private Q25 q25;
	private Q26 q26;
	private Q27 q27;
	private Q28 q28;
	private Q29 q29;

	// Classes dao

	private GenericDao<Q01> q1Dao;
	private GenericDao<Q02> q2Dao;
	private GenericDao<Q03> q3Dao;
	private GenericDao<Q04> q4Dao;
	private GenericDao<Q05> q5Dao;
	private GenericDao<Q06> q6Dao;
	private GenericDao<Q07> q7Dao;
	private GenericDao<Q08> q8Dao;
	private GenericDao<Q09> q9Dao;
	private GenericDao<Q10> q10Dao;
	private GenericDao<Q11> q11Dao;
	private GenericDao<Q12> q12Dao;
	private GenericDao<Q13> q13Dao;
	private GenericDao<Q14> q14Dao;
	private GenericDao<Q15> q15Dao;
	private GenericDao<Q16> q16Dao;
	private GenericDao<Q17> q17Dao;
	private GenericDao<Q18> q18Dao;
	private GenericDao<Q19> q19Dao;
	private GenericDao<Q20> q20Dao;
	private GenericDao<Q21> q21Dao;
	private GenericDao<Q22> q22Dao;
	private GenericDao<Q23> q23Dao;
	private GenericDao<Q24> q24Dao;
	private GenericDao<Q25> q25Dao;
	private GenericDao<Q26> q26Dao;
	private GenericDao<Q27> q27Dao;
	private GenericDao<Q28> q28Dao;
	private GenericDao<Q29> q29Dao;
	

	public QuestionarioBean() {
		q1Dao = new GenericDao<>();
		q2Dao = new GenericDao<>();
		q3Dao = new GenericDao<>();
		q4Dao = new GenericDao<>();
		q5Dao = new GenericDao<>();
		q6Dao = new GenericDao<>();
		q7Dao = new GenericDao<>();
		q8Dao = new GenericDao<>();
		q8Dao = new GenericDao<>();
		q9Dao = new GenericDao<>();
		q10Dao = new GenericDao<>();
		q11Dao = new GenericDao<>();
		q12Dao = new GenericDao<>();
		q13Dao = new GenericDao<>();
		q14Dao = new GenericDao<>();
		q15Dao = new GenericDao<>();
		q16Dao = new GenericDao<>();
		q17Dao = new GenericDao<>();
		q18Dao = new GenericDao<>();
		q19Dao = new GenericDao<>();
		q20Dao = new GenericDao<>();
		q21Dao = new GenericDao<>();
		q22Dao = new GenericDao<>();
		q23Dao = new GenericDao<>();
		q24Dao = new GenericDao<>();
		q25Dao = new GenericDao<>();
		q26Dao = new GenericDao<>();
		q27Dao = new GenericDao<>();
		q28Dao = new GenericDao<>();
		q29Dao = new GenericDao<>();
	}

	public void salvar() throws Exception {
		try {
			
			q1 = new Q01(altQ1);
			q1Dao.salvar(q1);
			
			q2 = new Q02(altQ2);
			q2Dao.salvar(q2);

			q3 = new Q03(altQ3);
			q3Dao.salvar(q3);

			q4 = new Q04(altQ4);
			q4Dao.salvar(q4);

			q5 = new Q05(altQ5);
			q5Dao.salvar(q5);

		
			q6 = new Q06(altQ6);
			q6Dao.salvar(q6);

			q6 = new Q06(altQ6);
			q6Dao.salvar(q6);

			q7 = new Q07(altQ7);
			q7Dao.salvar(q7);

			q8 = new Q08(altQ8);
			q8Dao.salvar(q8);

			q9 = new Q09(altQ9);
			q9Dao.salvar(q9);

			q10 = new Q10(altQ10);
			q10Dao.salvar(q10);

			q11 = new Q11(altQ11);
			q11Dao.salvar(q11);

			q12 = new Q12(altQ12);
			q12Dao.salvar(q12);

			q13 = new Q13(altQ13);
			q13Dao.salvar(q13);

			q14 = new Q14(altQ14);
			q14Dao.salvar(q14);

			q15 = new Q15(altQ15);
			q15Dao.salvar(q15);

			q16 = new Q16(altQ16);
			q16Dao.salvar(q16);

			q17 = new Q17(altQ17);
			q17Dao.salvar(q17);

			q18 = new Q18(altQ18);
			q18Dao.salvar(q18);

			q19 = new Q19(altQ19);
			q19Dao.salvar(q19);

			q20 = new Q20(altQ20);
			q20Dao.salvar(q20);

			q21 = new Q21(altQ21);
			q21Dao.salvar(q21);

			q22 = new Q22(altQ22);
			q22Dao.salvar(q22);

			q23 = new Q23(altQ23);
			q23Dao.salvar(q23);

			q24 = new Q24(altQ24);
			q24Dao.salvar(q24);

			q25 = new Q25(altQ25);
			q25Dao.salvar(q25);

			q26 = new Q26(altQ26);
			q26Dao.salvar(q26);

			q27 = new Q27(altQ27);
			q27Dao.salvar(q27);
			
			q28 = new Q28(altQ28);
			q28Dao.salvar(q28);

			q29 = new Q29();
			q29.setComentario(comentarios);
			q29Dao.salvar(q29);
		
			
			FacesContext.getCurrentInstance().getExternalContext().redirect("index.xhtml");

		} catch (Exception e) {
			throw e;
		}
	}

	public int getAltQ3() {
		return altQ3;
	}

	public void setAltQ3(int altQ3) {
		this.altQ3 = altQ3;
	}

	public int getAltQ4() {
		return altQ4;
	}

	public void setAltQ4(int altQ4) {
		this.altQ4 = altQ4;
	}

	public int getAltQ5() {
		return altQ5;
	}

	public void setAltQ5(int altQ5) {
		this.altQ5 = altQ5;
	}

	public int getAltQ6() {
		return altQ6;
	}

	public void setAltQ6(int altQ6) {
		this.altQ6 = altQ6;
	}

	public int getAltQ7() {
		return altQ7;
	}

	public void setAltQ7(int altQ7) {
		this.altQ7 = altQ7;
	}

	public int getAltQ8() {
		return altQ8;
	}

	public void setAltQ8(int altQ8) {
		this.altQ8 = altQ8;
	}

	public int getAltQ9() {
		return altQ9;
	}

	public void setAltQ9(int altQ9) {
		this.altQ9 = altQ9;
	}

	public int getAltQ10() {
		return altQ10;
	}

	public void setAltQ10(int altQ10) {
		this.altQ10 = altQ10;
	}

	public int getAltQ11() {
		return altQ11;
	}

	public void setAltQ11(int altQ11) {
		this.altQ11 = altQ11;
	}

	public int getAltQ12() {
		return altQ12;
	}

	public void setAltQ12(int altQ12) {
		this.altQ12 = altQ12;
	}

	public int getAltQ13() {
		return altQ13;
	}

	public void setAltQ13(int altQ13) {
		this.altQ13 = altQ13;
	}

	public int getAltQ14() {
		return altQ14;
	}

	public void setAltQ14(int altQ14) {
		this.altQ14 = altQ14;
	}

	public int getAltQ15() {
		return altQ15;
	}

	public void setAltQ15(int altQ15) {
		this.altQ15 = altQ15;
	}

	public int getAltQ16() {
		return altQ16;
	}

	public void setAltQ16(int altQ16) {
		this.altQ16 = altQ16;
	}

	public int getAltQ17() {
		return altQ17;
	}

	public void setAltQ17(int altQ17) {
		this.altQ17 = altQ17;
	}

	public int getAltQ18() {
		return altQ18;
	}

	public void setAltQ18(int altQ18) {
		this.altQ18 = altQ18;
	}

	public int getAltQ19() {
		return altQ19;
	}

	public void setAltQ19(int altQ19) {
		this.altQ19 = altQ19;
	}

	public int getAltQ20() {
		return altQ20;
	}

	public void setAltQ20(int altQ20) {
		this.altQ20 = altQ20;
	}

	public int getAltQ21() {
		return altQ21;
	}

	public void setAltQ21(int altQ21) {
		this.altQ21 = altQ21;
	}

	public int getAltQ22() {
		return altQ22;
	}

	public void setAltQ22(int altQ22) {
		this.altQ22 = altQ22;
	}

	public int getAltQ23() {
		return altQ23;
	}

	public void setAltQ23(int altQ23) {
		this.altQ23 = altQ23;
	}

	public int getAltQ24() {
		return altQ24;
	}

	public void setAltQ24(int altQ24) {
		this.altQ24 = altQ24;
	}

	public int getAltQ25() {
		return altQ25;
	}

	public void setAltQ25(int altQ25) {
		this.altQ25 = altQ25;
	}

	public int getAltQ26() {
		return altQ26;
	}

	public void setAltQ26(int altQ26) {
		this.altQ26 = altQ26;
	}

	public int getAltQ27() {
		return altQ27;
	}

	public void setAltQ27(int altQ27) {
		this.altQ27 = altQ27;
	}

	public int getAltQ28() {
		return altQ28;
	}

	public void setAltQ28(int altQ28) {
		this.altQ28 = altQ28;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	public int getAltQ1() {
		return altQ1;
	}

	public void setAltQ1(int altQ1) {
		this.altQ1 = altQ1;
	}

	public int getAltQ2() {
		return altQ2;
	}

	public void setAltQ2(int altQ2) {
		this.altQ2 = altQ2;
	}

	public int getBarra() {
		return barra;
	}

	public void setBarra(int barra) {
		this.barra = barra;
	}

}
