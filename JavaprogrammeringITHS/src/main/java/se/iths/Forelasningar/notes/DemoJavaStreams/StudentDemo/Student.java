package se.iths.Forelasningar.notes.DemoJavaStreams.StudentDemo;

import java.util.List;

public record Student(String firstname, String lastName, String email, int credits, List<Course> courseList) {
}
