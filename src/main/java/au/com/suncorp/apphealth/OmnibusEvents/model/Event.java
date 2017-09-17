package au.com.suncorp.apphealth.OmnibusEvents.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String identifier;
    private int serial;
    private String node;
    private String alert_group;
    private String alert_key;
    private String agent;
    private int ams_call_itm;
    private int ams_call_nonitm;
    private int ams_call_offline;
    private int ams_call_rrt;
    private String ams_eventstatus;
    private String ams_evtclass;
    private String ams_evtorigin;
    private String ams_hostname;
    private String ams_message;
    private String ams_product;
    private String ams_rrt_details;
    private String ams_severity;
    private String ams_sitdisplitm;
    private String ams_sitorig;
    private String ams_situation;
    private String ams_subsource;
    private int event_class;
    private String event_id;
    private int expire_time;
    private int severity;
    private String type;
    private String summary;
    private Timestamp first_occurrence;
    private Timestamp last_occurrence;
    private int tally;
    private String remedy_int;
    private int suppress_escl;
    private Timestamp created;
    private Timestamp updated;

    public Event(){
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public String getNode() {
        return node;
    }

    public void setNode(String node) {
        this.node = node;
    }

    public String getAlert_group() {
        return alert_group;
    }

    public void setAlert_group(String alert_group) {
        this.alert_group = alert_group;
    }

    public String getAlert_key() {
        return alert_key;
    }

    public void setAlert_key(String alert_key) {
        this.alert_key = alert_key;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public int getAms_call_itm() {
        return ams_call_itm;
    }

    public void setAms_call_itm(int ams_call_itm) {
        this.ams_call_itm = ams_call_itm;
    }

    public int getAms_call_nonitm() {
        return ams_call_nonitm;
    }

    public void setAms_call_nonitm(int ams_call_nonitm) {
        this.ams_call_nonitm = ams_call_nonitm;
    }

    public int getAms_call_offline() {
        return ams_call_offline;
    }

    public void setAms_call_offline(int ams_call_offline) {
        this.ams_call_offline = ams_call_offline;
    }

    public int getAms_call_rrt() {
        return ams_call_rrt;
    }

    public void setAms_call_rrt(int ams_call_rrt) {
        this.ams_call_rrt = ams_call_rrt;
    }

    public String getAms_eventstatus() {
        return ams_eventstatus;
    }

    public void setAms_eventstatus(String ams_eventstatus) {
        this.ams_eventstatus = ams_eventstatus;
    }

    public String getAms_evtclass() {
        return ams_evtclass;
    }

    public void setAms_evtclass(String ams_evtclass) {
        this.ams_evtclass = ams_evtclass;
    }

    public String getAms_evtorigin() {
        return ams_evtorigin;
    }

    public void setAms_evtorigin(String ams_evtorigin) {
        this.ams_evtorigin = ams_evtorigin;
    }

    public String getAms_hostname() {
        return ams_hostname;
    }

    public void setAms_hostname(String ams_hostname) {
        this.ams_hostname = ams_hostname;
    }

    public String getAms_message() {
        return ams_message;
    }

    public void setAms_message(String ams_message) {
        this.ams_message = ams_message;
    }

    public String getAms_product() {
        return ams_product;
    }

    public void setAms_product(String ams_product) {
        this.ams_product = ams_product;
    }

    public String getAms_rrt_details() {
        return ams_rrt_details;
    }

    public void setAms_rrt_details(String ams_rrt_details) {
        this.ams_rrt_details = ams_rrt_details;
    }

    public String getAms_severity() {
        return ams_severity;
    }

    public void setAms_severity(String ams_severity) {
        this.ams_severity = ams_severity;
    }

    public String getAms_sitdisplitm() {
        return ams_sitdisplitm;
    }

    public void setAms_sitdisplitm(String ams_sitdisplitm) {
        this.ams_sitdisplitm = ams_sitdisplitm;
    }

    public String getAms_sitorig() {
        return ams_sitorig;
    }

    public void setAms_sitorig(String ams_sitorig) {
        this.ams_sitorig = ams_sitorig;
    }

    public String getAms_situation() {
        return ams_situation;
    }

    public void setAms_situation(String ams_situation) {
        this.ams_situation = ams_situation;
    }

    public String getAms_subsource() {
        return ams_subsource;
    }

    public void setAms_subsource(String ams_subsource) {
        this.ams_subsource = ams_subsource;
    }

    public int getEvent_class() {
        return event_class;
    }

    public void setEvent_class(int event_class) {
        this.event_class = event_class;
    }

    public String getEvent_id() {
        return event_id;
    }

    public void setEvent_id(String event_id) {
        this.event_id = event_id;
    }

    public int getExpire_time() {
        return expire_time;
    }

    public void setExpire_time(int expire_time) {
        this.expire_time = expire_time;
    }

    public int getSeverity() {
        return severity;
    }

    public void setSeverity(int severity) {
        this.severity = severity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Timestamp getFirst_occurrence() {
        return first_occurrence;
    }

    public void setFirst_occurrence(Timestamp first_occurrence) {
        this.first_occurrence = first_occurrence;
    }

    public Timestamp getLast_occurrence() {
        return last_occurrence;
    }

    public void setLast_occurrence(Timestamp last_occurrence) {
        this.last_occurrence = last_occurrence;
    }

    public int getTally() {
        return tally;
    }

    public void setTally(int tally) {
        this.tally = tally;
    }

    public String getRemedy_int() {
        return remedy_int;
    }

    public void setRemedy_int(String remedy_int) {
        this.remedy_int = remedy_int;
    }

    public int getSuppress_escl() {
        return suppress_escl;
    }

    public void setSuppress_escl(int suppress_escl) {
        this.suppress_escl = suppress_escl;
    }

    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    public Timestamp getUpdated() {
        return updated;
    }

    public void setUpdated(Timestamp updated) {
        this.updated = updated;
    }
}
