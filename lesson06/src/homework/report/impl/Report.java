package homework.report.impl;

import homework.User;
import homework.report.Reportable;

public class Report implements Reportable {
    @Override
    public String generateReport(User user) {
        return "Report for user: " + user.getName();
    }
}
