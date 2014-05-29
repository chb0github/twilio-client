package org.bongiorno.ws.client;

import org.bongiorno.dto.support.AbstractDto;

import java.util.Date;
import java.util.Map;

/**
 * @author chribong
 */

public class TwilioResponse extends AbstractDto{

    private String sid;
    private Date date_created;
    private Date date_updated;
    private Date date_sent;
    private String account_sid;
    private String to;
    private String from;
    private String body;
    private String status;
    private Integer num_segments;
    private Integer num_media;
    private String direction;
    private Float price;
    private String price_unit;
    private String uri;
    private String api_version;
    private Integer error_code;
    private String error_message;
    private Map<String,Object> subresource_uris;

    public String getSid() {
        return sid;
    }

    public Date getDateCreated() {
        return date_created;
    }

    public Date getDateUpdated() {
        return date_updated;
    }

    public Date getDateSent() {
        return date_sent;
    }

    public String getAccountSid() {
        return account_sid;
    }

    public String getTo() {
        return to;
    }

    public String getFrom() {
        return from;
    }

    public String getBody() {
        return body;
    }

    public String getStatus() {
        return status;
    }

    public Integer getNumSegments() {
        return num_segments;
    }

    public Integer getNumMedia() {
        return num_media;
    }

    public String getDirection() {
        return direction;
    }

    public Float getPrice() {
        return price;
    }

    public String getPriceUnit() {
        return price_unit;
    }

    public String getUri() {
        return uri;
    }

    public String getApiVersion() {
        return api_version;
    }

    public Map<String, Object> getSubResourceUris() {
        return subresource_uris;
    }
}
