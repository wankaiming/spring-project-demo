package com.project.demo.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.support.RequestContext;

public class ValidateUtil {


    /**
     * Invoke the default Validator for the supplied object
     *
     * @param obj the the target bean to bind the parameters to
     * @return the BindingResult instance that store the errors
     */
    public static BindingResult invokeValidator(Object obj) {
        return invokeValidator(obj, (Object[]) null);
    }

    /**
     * Invoke the default Validator for the supplied object
     *
     * @param obj the the target bean to bind the parameters to
     * @param validationHints one or more hint objects to be passed to the
     * validation engine
     * @return the BindingResult instance that store the errors
     */
    public static BindingResult invokeValidator(Object obj, Object... validationHints) {
        String objectName = obj.getClass().getSimpleName();
        objectName = objectName.substring(0, 1).toLowerCase() + objectName.substring(1);
        return invokeValidator(obj, objectName, validationHints);
    }

    /**
     * Invoke the default Validator for the supplied object
     *
     * @param obj the the target bean to bind the parameters to
     * @param objectName the name of the target object
     * @return the BindingResult instance that store the errors
     */
    public static BindingResult invokeValidator(Object obj, String objectName) {
        return invokeValidator(obj, objectName, (Object[]) null);
    }

    /**
     * 获取验证出错信息 返回错误list
     *
     * @param bindingResult
     * @return
     */
    public static List<String> errorMessageList(BindingResult bindingResult) {
        if (bindingResult == null || !bindingResult.hasErrors()) {
            return null;
        }
        RequestContext requestContext = new RequestContext(((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest());
        List<String> errorList = new ArrayList<String>();
        for (ObjectError error : bindingResult.getAllErrors()) {
            errorList.add(requestContext.getMessage(error));
        }
        return errorList;
    }

    /**
     * 获取验证出错信息 返回<br/>分割的字符串
     *
     *
     * @param bindingResult
     * @return
     */
    public static String errorMessage(BindingResult bindingResult) {
        if (bindingResult == null || !bindingResult.hasErrors()) {
            return null;
        }
        List<String> errorList = errorMessageList(bindingResult);
        String msg = "";
        for (String errmsg : errorList) {
            msg += "," + errmsg;
        }
        return msg.isEmpty() ? null : msg.substring(1); // remove head <br/>
    }
}
