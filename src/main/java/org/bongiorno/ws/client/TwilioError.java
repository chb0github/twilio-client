package org.bongiorno.ws.client;

import org.bongiorno.dto.support.AbstractDto;

/**
 * @author chribong
 */
public class TwilioError extends AbstractDto {

    private Integer code;
    private String message;
    private String more_info;
    private Integer status;

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getMoreInfo() {
        return more_info;
    }

    public Integer getHttpStatusCode() {
        return status;
    }
}
