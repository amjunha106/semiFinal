package htproject.z01_vo;

public class T_info {
	private String t_num;
	private String train_type;
	private String train_depart;
	private String train_arrive;
	private String train_go;
	private String train_stop;
	private String train_rounge;
	public T_info() {
		super();
		// TODO Auto-generated constructor stub
	}
	public T_info(String t_num, String train_type, String train_depart, String train_arrive, String train_go,
			String train_stop, String train_rounge) {
		super();
		this.t_num = t_num;
		this.train_type = train_type;
		this.train_depart = train_depart;
		this.train_arrive = train_arrive;
		this.train_go = train_go;
		this.train_stop = train_stop;
		this.train_rounge = train_rounge;
	}
	public String getT_num() {
		return t_num;
	}
	public void setT_num(String t_num) {
		this.t_num = t_num;
	}
	public String getTrain_type() {
		return train_type;
	}
	public void setTrain_type(String train_type) {
		this.train_type = train_type;
	}
	public String getTrain_depart() {
		return train_depart;
	}
	public void setTrain_depart(String train_depart) {
		this.train_depart = train_depart;
	}
	public String getTrain_arrive() {
		return train_arrive;
	}
	public void setTrain_arrive(String train_arrive) {
		this.train_arrive = train_arrive;
	}
	public String getTrain_go() {
		return train_go;
	}
	public void setTrain_go(String train_go) {
		this.train_go = train_go;
	}
	public String getTrain_stop() {
		return train_stop;
	}
	public void setTrain_stop(String train_stop) {
		this.train_stop = train_stop;
	}
	public String getTrain_rounge() {
		return train_rounge;
	}
	public void setTrain_rounge(String train_rounge) {
		this.train_rounge = train_rounge;
	}
	
	
}
