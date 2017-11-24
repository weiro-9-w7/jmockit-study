package mod.code.tec;


import javax.servlet.http.HttpServletRequest;

public class UseHttpParam {

    public String printHttpParams(HttpServletRequest request){
        String[] parameterValues = request.getParameterValues("aa");
        return parameterValues[0];
    }
}
