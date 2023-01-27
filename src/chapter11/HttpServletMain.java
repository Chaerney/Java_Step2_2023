package chapter11;

public class HttpServletMain {

	public static void main(String[] args) {
		method(new LoginService());
		method(new FileDownloadService());

	}
	
	//메서드
	public static void method(HttpServlet hs) {
		hs.service();
	}
	
}
