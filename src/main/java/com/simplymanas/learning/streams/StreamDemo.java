package com.simplymanas.learning.streams;

import java.util.Arrays;
import java.util.List;

public class StreamDemo {

    String firstName;
    String lastName;
    int electionYear;
    String party;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getElectionYear() {
        return electionYear;
    }

    public void setElectionYear(int electionYear) {
        this.electionYear = electionYear;
    }

    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party;
    }

    public StreamDemo(String firstName, String lastName, int electionYear, String party) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.electionYear = electionYear;
        this.party = party;
    }

    public static void main(String[] args) {

        List<StreamDemo> presidents = Arrays.asList(
                new StreamDemo("Donald", "Trumph", 2016, "communist"),
                new StreamDemo("Barack", "Obama", 2012, "markcist"),
                new StreamDemo("George W.", "Bush", 2008, "communist"),
                new StreamDemo("George W.", "Bush", 2004, "communist"),
                new StreamDemo("Ronald", "Reign", 2000, "republican")
        );

        presidents.stream()
                .filter(president -> president.electionYear > 2000)
                .map(StreamDemo::getLastName)
                .distinct()
                .limit(2)
                .forEach(System.out::println);
    }

}