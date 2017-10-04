package com.learning.java.model;

import java.time.Period;
import lombok.Data;

/**
 * Created by krvh271 on 9/30/17.
 */
@Data
public class Semester {
    private String educationalYear;
    private SemesterName name;
    private Period examSchedule;
    private Period issueHallTicket;
    private Period holidays;
}
