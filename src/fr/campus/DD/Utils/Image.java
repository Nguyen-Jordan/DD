package fr.campus.DD.Utils;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Image {
    static Map<String, String> map = Stream.of(new String[][] {
            {
                "Dice",
                "    _______            \n" +
                        "  /\\       \\           \n" +
                        " /()\\   ()  \\          \n" +
                        "/    \\_______\\         \n" +
                        "\\    /()     /         \n" +
                        " \\()/   ()  /          \n" +
                        "  \\/_____()/"
            },
            {
                "Dice 1",
                "╔═══════════╗\n" +
                        "║           ║\n" +
                        "║     ◯     ║\n" +
                        "║           ║\n" +
                        "╚═══════════╝"
            },
            {
                    "Dice 2",
                    "╔═══════════╗\n" +
                            "║  ◯        ║\n" +
                            "║           ║\n" +
                            "║        ◯  ║\n" +
                            "╚═══════════╝"
            },
            {
                    "Dice 3",
                    "╔═══════════╗\n" +
                            "║  ◯        ║\n" +
                            "║     ◯     ║\n" +
                            "║        ◯  ║\n" +
                            "╚═══════════╝"
            },
            {
                    "Dice 4",
                    "╔═══════════╗\n" +
                            "║  ◯     ◯  ║\n" +
                            "║           ║\n" +
                            "║  ◯     ◯  ║\n" +
                            "╚═══════════╝"
            },
            {
                    "Dice 5",
                    "╔═══════════╗\n" +
                            "║  ◯     ◯  ║\n" +
                            "║     ◯     ║\n" +
                            "║  ◯     ◯  ║\n" +
                            "╚═══════════╝"
            },
            {
                    "Dice 6",
                    "╔═══════════╗\n" +
                            "║  ◯     ◯  ║\n" +
                            "║  ◯     ◯  ║\n" +
                            "║  ◯     ◯  ║\n" +
                            "╚═══════════╝"
            },{
              "welcome",
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣤⣤⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠻⣿⣿⣿⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⣯⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⣿⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣿⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⢺⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡏⣧⣀⣀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢶⣿⣋⣟⠭⣿⣿⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢻⣿⣭⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀WELCOME ⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡏⢮⣳⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀TO ⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⡿⣦⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀DONJONS & DRAGONS⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⠢⣽⣅⠀⠀⠀⠀⠀⠀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⡆⢤⣿⡇⠀⠀⠀⠀⣸⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢷⠸⣞⡇⠀⠀⠀⠀⡏⢧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡄⣿⣷⠀⠀⠀⠀⢻⡈⢣⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣇⢸⣿⡆⠀⠀⠀⠀⢳⣬⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⡈⣿⣧⠀⠀⢠⡄⣸⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⡇⢹⣿⡀⠀⢸⢧⠟⢹⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠸⣿⡇⣠⠋⢾⣾⢸⢀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡖⠀⠸⣿⣶⣿⣷⡏⢰⡿⢿⠏⣸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⡇⠀⣴⢋⣿⣿⣿⠇⡟⠁⣏⠀⣿⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⡞⣏⢦⠇⢸⡿⢿⠋⢀⣤⣀⡘⢦⡟⢸⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⣿⠃⢀⣴⡆⠀⠀⠈⣹⣿⡷⠆⠀⣧⠈⢿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⠜⢁⡴⠋⡀⠙⢄⠀⣰⣿⣟⠓⠀⠀⢉⣴⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⣤⢰⡏⡠⠊⢀⡴⣇⠀⢀⡞⠉⠛⠀⡀⢀⣄⣩⠌⠙⢦⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⣿⢣⠶⠖⠊⢀⣈⠉⣹⡷⢀⣴⡯⠔⣛⡵⠁⣠⡏⠸⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⢹⡿⢿⠟⠀⣰⡞⠉⣿⡷⠇⠃⣠⢴⣶⣾⡋⢀⡴⣽⠁⠀⠘⣏⣀⢰⣆⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⣠⣶⣶⣅⣠⣶⠀⠒⠟⢁⡴⠋⠀⠀⠀⢹⣿⣿⡋⣧⢸⡇⡏⣀⣀⠀⠙⣿⣉⠙⢤⡄⠀⠀⠀\n" +
                    "⠀⠀⣠⣴⣺⢿⣿⣿⡛⠛⠿⠿⣯⣷⡲⣶⣟⣻⡀⠀⣠⣿⣿⣖⣸⣨⣿⠿⠛⣻⣿⣶⣾⣾⠇⠀⠻⣄⠀⠀\n" +
                    "⠀⣾⢟⠿⠿⢶⣮⡙⢏⢢⡀⢠⡌⣿⣿⡿⠟⡿⢳⣼⣿⣿⣿⣾⣿⣧⣤⣤⣤⣿⣿⣭⣿⠁⠀⠀⣀⣈⣧⠀\n" +
                    "⢺⣥⢿⠾⠿⠿⠿⡿⠚⢋⣠⠯⣿⢉⢉⠻⠾⠛⢿⣿⠻⠿⢛⢋⣤⣯⣭⠽⠶⣾⣻⢿⣻⢿⠶⢛⣻⡿⢽⠄"
            },{
                    "Wizard",
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠁⠒⠤⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡀⡀⠀⢀⠐⡊⠀⠲⠤⣄⠄⠀⠐⠤⣦⢤⣄⢂⡀⠀⠑⠢⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡤⠞⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠁⠈⢥⢖⢤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠥⠂⠄⠁⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣾⣿⣿⣿⣿⣷⡦⠑⠢⣾⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⢻⡿⠙⠿⣿⣿⣿⣿⡀⠀⠀⠈⢢⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⢹⣻⡷⠿⢷⣿⣿⡿⠁⠀⠀⠀⠀⠳⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣿⠀⠀⣦⣻⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⡀⣸⢽⣿⢀⡶⣿⣟⡀⠀⠀⠀⠀⠀⠈⢢⠆⠀⠀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢾⡟⣼⡷⣋⡇⠀⠀⠀⠀⠀⠀⠀⣀⣴⣾⢏⣿⣿⣿⢶⣶⡞⣿⣿⣿⣷⣀⠀⠀⠀⠀⠐⠳⡄⠀⣷⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣀⡻⠇⠈⠀⠀⠀⠀⠐⣶⣶⡶⠷⣭⣛⢷⣿⣿⣿⣿⣭⣷⣿⣿⣿⣿⢿⡆⠀⠀⠀⠀⢀⡙⣆⠛⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀Name: %1$s\n"+
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⡟⣏⣧⠀⠀⠀⠰⣾⣷⡛⣯⣿⣦⡙⠺⢽⣷⣿⣿⣿⣿⣿⣿⣿⢿⠗⠛⢉⣝⠝⠀⠀⠘⣳⢸⡾⣹⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀Type: %2$s\n"+
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣇⠀⠉⣹⡄⠀⠀⠀⣨⣿⣿⣾⣿⣿⣷⡄⠀⠀⠉⢻⣷⣿⡟⠉⠉⠁⢀⣴⡿⣻⣦⠄⠀⠢⢻⡘⢽⢣⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀Life: %3$s\n"+
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢷⣄⠀⠛⣄⣠⡾⣋⣮⣿⣿⣿⣿⣿⣿⣦⣀⣀⣸⣙⣋⣀⣀⡀⣠⣿⣿⣿⡿⡎⠀⠈⠂⢀⣖⣬⢼⣧⣣⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀Force: %4$s\n"+
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⡦⢀⠁⣿⣿⣻⣿⣻⣿⣿⣿⣿⣿⣿⠻⣿⡿⢩⢹⣏⠙⢟⢻⣿⣿⣿⣿⡿⠆⢰⣀⡼⠵⡭⠤⢼⠝⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢻⢏⠦⣹⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣭⡟⢡⣿⣏⣿⣥⣬⣺⣿⣿⣿⠻⠞⣤⢞⠉⠀⣠⠝⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⠘⠐⢝⡃⣿⣿⣿⣿⣧⣿⣿⣿⣿⣿⡿⢡⣿⢿⣿⡼⣼⣷⣿⣿⣿⣿⣷⢸⠻⢭⣶⢠⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠁⠱⠘⢷⡿⣿⡟⢱⣮⣿⣿⣿⣿⡿⣻⣿⣿⣿⠟⣿⡹⣿⣿⣿⣿⣿⣧⣯⢄⣊⡱⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠀⣿⣼⣿⣿⣿⣟⣽⣿⣿⣿⣵⠿⣿⣷⣿⣿⣿⣻⣟⣿⣧⣷⡟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⢮⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⡿⠿⠿⣿⣿⣿⣟⡿⠛⠋⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣾⣿⣿⣿⣿⣿⣿⣿⣿⣋⣀⣤⣾⣿⣿⣿⣿⣿⡤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⣿⣿⣿⣿⣿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⣷⣿⣿⣿⣿⣿⡇⠸⡯⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⢮⣿⣿⣿⣿⣿⣿⣿⣧⣶⢃⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢐⣳⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
            "⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⢟⣾⣿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⣿⢿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⠀⠀⠀⣂⣠\n"+
            "⡟⠸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣴⢯⣯⣿⣿⡟⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡛⠛⠛⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣡⣿⣿⣿⣿\n"+
            "⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣿⣫⣿⣿⣿⣿⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣶⣶⣀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣤⣶⣿⣿⣿⣿⣿\n"+
            "⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢛⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⡈⠭⠂⠀⠀⠀⠀⣠⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"+
            "⣷⣤⣄⣤⣤⠀⠀⠀⠀⠀⠀⠲⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠿⠟⠋⠙⠙⠋⠉⠉⠉⠀⠀⠀⠀⢀⣤⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"+
            "⣿⣿⣿⣿⣿⣦⣀⠀⠀⠀⠀⠀⠀⠉⠉⠉⠉⠯⠙⠻⠿⠿⠻⠿⠿⠿⠿⠿⠿⠿⠿⠟⠙⠋⠉⠁⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"+
            "⣿⣿⣿⣿⣿⣿⣿⣷⣶⣶⣴⣄⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⢀⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"+
            "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣶⣦⣄⣀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"+
            "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣾⣶⣶⣬⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣦⣵⣴⣶⣶⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
            },
            {
                    "Warrior",
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⣿⢶⡦⢦⣤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⣿⣇⣸⣧⣾⣯⣻⢶⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣷⣻⣿⣭⠟⠛⠻⢾⣸⣿⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⡍⠈⠉⠀⠀⠀⠀⢉⣾⢹⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿⣿⣄⠀⠀⠀⣀⣶⡿⠃⢻⣆⢀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠹⣿⣿⠶⠶⠾⠋⠒⠀⣀⣾⣿⣿⣿⣆⠀⢀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠿⣷⣶⣶⠁⠀⠴⣱⣿⢟⣿⡿⠟⠉⠉⠉⠉⢶⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀       Name: %1$s\n"+
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⠛⣿⢿⣧⣴⡾⣋⣷⠿⣻⠃⢀⣤⣶⢶⢿⣿⢿⣿⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀       Type: %2$s\n"+
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢴⡛⣿⠀⠈⣧⣿⣯⠞⠉⣡⣶⣿⣷⡟⢿⠉⢮⡀⠙⣆⣿⣿⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀       Life: %3$s\n"+
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⠷⣜⢷⠀⣿⣽⡟⢀⣶⣋⣽⣿⣿⣷⣌⢷⣀⣿⡿⡿⢿⢿⡹⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀       Force: %4$s\n"+
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣄⠈⠻⣿⣿⣿⠦⢿⣭⣶⣿⣹⣿⣿⡟⠻⣿⢻⡹⡝⣌⢶⢷⡹⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⣿⣿⣷⣾⠋⣧⠉⣏⡻⠋⢙⣿⣿⣿⣿⣿⡀⣿⠆⢹⡙⡝⣎⢦⢷⡽⠆⠀⠀⠀⠀⠀⠀⠀⠀\n"+
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⣉⣿⣿⣿⠀⣿⢀⠟⠀⡴⠏⡇⢈⣿⣿⣿⣷⠸⡎⠆⢻⣙⣼⣾⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⡏⠉⣿⣿⣇⡿⠋⣠⠞⡇⠀⣇⠀⠻⣻⣿⣿⣷⡿⠾⠛⠋⠉⠹⣿⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠻⣦⣀⣿⣿⣯⣄⡶⢹⠀⣿⠀⣿⠀⠀⢙⣿⣿⣿⣦⡀⠀⣀⡠⠖⠻⣿⡆⠀⣠⣶⢦⡀⠀⠀⠀\n"+
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣴⣿⠋⣿⣿⣿⣿⣆⠈⡄⢹⠀⢸⠀⣤⣾⣿⣿⣿⣿⣷⣉⣁⡀⠀⠀⣹⣿⡾⠟⣧⢿⣇⠀⠀⠀\n"+
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣴⣿⣿⣸⣿⣿⡿⣿⣿⣷⣄⡀⣀⣠⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠋⣠⠞⠁⢸⣿⡆⠀⠀\n"+
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⣿⣿⣿⢁⣟⣿⣿⣷⣿⣿⣍⠉⠛⠟⠿⠿⠿⠿⠿⠛⠿⣿⣿⣿⣿⣻⡿⠋⢀⡞⠁⠀⠀⢸⣿⣧⠀⠀\n"+
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⠻⣿⡏⣾⣿⣿⣿⣿⣿⣿⣿⣿⣶⣶⣶⣶⣶⣶⣶⣶⢿⡟⣻⣿⣿⠟⠁⡰⠋⠀⠀⠀⠀⢸⣿⣿⡄⠀\n"+
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣆⠙⠷⠿⣿⢏⣿⣿⣛⡷⢾⣇⣀⠼⣏⠉⠉⡉⠁⠀⠀⣿⣼⡿⠃⣠⠞⠁⠀⠀⠀⠀⠀⢸⣿⣿⡇⠀\n"+
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣏⠈⠳⣄⣿⣿⣷⣿⠋⡻⢿⣷⣿⣁⣀⣼⣤⣶⣶⣶⠶⣿⣿⠟⢀⡼⠁⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⢣⠀\n"+
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⠯⣕⣶⣾⣿⡻⣿⡿⣤⠃⣴⣿⠋⣿⢿⢸⣉⣉⣉⣀⣴⣿⠃⣠⠟⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⣿⣿⣼⠀\n"+
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡏⢠⣌⠙⣿⣿⣿⣿⣤⣯⣶⣿⣏⣀⣿⠈⠈⡉⠙⢿⣿⡿⠁⣠⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣯⣼⣿⡄\n"+
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣷⣿⢿⣷⣿⢿⣻⢿⣏⢻⣿⡿⣿⣿⣿⠀⣀⠙⢶⣿⡟⠀⣰⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⡿⢿⣿⡇\n"+
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣾⣯⣵⣿⣿⡿⢷⣟⣾⣭⣿⣿⠃⣿⣿⣿⡂⠉⣶⣿⠟⠀⢠⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣵⣾⣿⡇\n"+
            "⠀⠀⠀⠀⠀⠀⠀⢀⣀⠀⠀⢀⡴⠟⣩⡿⠋⠉⢉⣿⣆⣾⣹⡿⣷⣿⡿⢸⣿⣿⣿⣙⢿⣿⡿⠀⢀⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢺⣿⣿⣿⣿⠇\n"+
            "⠀⠀⠀⠀⠀⠀⢀⡾⠿⣤⣶⣏⡠⠞⠉⠀⠀⠀⣟⣏⣾⣿⣿⡿⢻⣿⡇⣾⣿⣿⣿⣿⣿⣿⠀⠀⣾⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣼⣿⣿⣿⢻⠀\n"+
            "⠀⠀⠀⠀⢀⣠⠞⠀⢀⡽⢿⣏⠀⠀⠀⠀⠀⠀⣿⣽⣿⣿⠿⣧⣼⣿⣅⣽⣿⣿⣿⣿⣿⠃⠀⣰⣁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢺⣿⣿⣿⡟⡞⠀\n"+
            "⢀⡀⠀⠈⠉⠁⣠⡶⠋⠁⢀⣼⠷⠀⠀⠀⠀⢸⣿⣿⣯⡀⠀⠀⠈⣿⣿⣿⣿⠟⠉⣿⡿⠀⢀⣿⠿⣄⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣾⣿⣿⣿⣿⡇⠀\n"+
            "⢸⡇⠀⢀⣰⣾⠏⠀⢀⡴⠋⠀⠀⠀⢴⣶⣿⣿⣿⣿⣿⡁⠠⣄⣾⣿⣿⣿⠋⠀⠀⠿⠧⢀⣄⣄⣀⣀⠀⠉⠙⠲⢤⡀⠀⠀⠀⠀⣾⠋⣉⣿⡿⣹⠁⠀\n"+
            "⠞⢀⣴⡺⠏⠁⠀⠀⢸⠁⠀⠀⠀⠀⢸⣿⡿⡏⣙⡿⣿⣷⣒⣸⣿⣿⡿⠁⠀⠀⠀⠀⠀⠀⠀⠙⢿⣿⣿⣶⣦⣄⡀⠙⢦⡀⠀⢠⣿⡾⠛⣁⣠⠇⠀⠀\n"+
            "⠶⡻⠏⠁⠀⢀⣀⣤⡼⠂⠀⠀⠀⢠⣿⡇⢹⠃⢃⢇⣼⠿⠿⢿⣿⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠻⣿⣿⣿⣿⣿⣦⡀⠙⢦⣾⢋⡴⠊⠁⠀⠀⠀⠀\n"+
            "⠊⣀⣴⡶⠾⠛⠛⠉⠁⠀⠀⠀⠀⢸⣼⠀⡿⠀⡼⣿⣿⣀⣀⢀⠞⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣿⠹⡽⣿⣿⣿⣦⡀⡽⠋⠀⣶⡶⣶⢶⡶⣶\n"+
            "⠿⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⣶⠛⢿⣶⣇⣰⣿⣿⣯⣈⣉⣹⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⣆⢻⠹⢿⣿⣿⣿⣧⡀⠀⠛⠛⠛⠛⠛⠛\n"+
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢦⡀⠉⠙⠛⠛⠉⣹⠛⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⢛⢿⢿⡿⣿⠛⠁⢀⣿⠀⠀⠀⠀⠀⠀⠀\n"
            },{
                "Weapon",
                            "⢸⢓⠒⠤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠈⣏⡷⢄⠀⠙⢦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠹⣷⡊⠳⣄⠀⠙⢤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀ ⠘⢷⣨⠈⢷⣄⠀⠙⢦⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀  ⠀⠙⢿⡾⢿⣧⡄⠀⠳⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀Name of the Weapon: %1$s\n" +
                            "⠀⠀⠀⠀⠀ ⠀  ⠙⣷⣄⠛⣧⡀⠈⠳⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀Point of attack: %2$s\n" +
                            "⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠈⠻⣷⣽⢿⢦⡀⠈⠳⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀ ⠈⢻⣮⡻⣷⣄⠀⠘⢦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀  ⠀⠀⠙⢿⣾⣿⣷⣄ ⠉⠦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⠀⠀⠀⠀⠀⠙⢿⣿⣿⣷⡄⠈⠙⢦⡀⠀⠀⠀⠀⠀⠀⠀⣀⡀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⠀⠀⠀⠀⠀⠀⠀⠀⠙⢿⣿⣿⣦⡀⠀⣙⢦⡀⠀⠀⠀⢰⣿⢻⣿⠆⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠈⠙⢿⣿⣿⣿⣁⠂⣙⣤⣀⣠⣾⣿⣿⠟⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠻⣿⣿⣿⣿⣿⣛⣹⣿⣿⠟⠁⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠈⢻⣯⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⣠⣿⣿⣿⣿⣿⡟⠙⠳⣄⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⢀⣾⡹⠿⢛⣻⡿⠋⠉⢿⣷⣄⠀⠈⠳⣄⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠘⢯⣉⡥⠟⠋⠀⠀⠀⠀⠙⢿⣷⡀⠀⠈⠧⣀⣀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢿⡇⣀⡤⢻⢿\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣹⣿⣷⣿⢟"
            },{
                "Fate",
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⡀⠀⣀⣀⠀⢀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⢀⣠⣴⣾⣿⣿⣇⠸⣿⣿⠇⣸⣿⣿⣷⣦⣄⡀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⢀⣠⣴⣶⠿⠋⣩⡿⣿⡿⠻⣿⡇⢠⡄⢸⣿⠟⢿⣿⢿⣍⠙⠿⣶⣦⣄⡀⠀\n" +
                            "⠀⠀⠉⠉⠁⠶⠟⠋⠀⠉⠀⢀⣈⣁⡈⢁⣈⣁⡀⠀⠉⠀⠙⠻⠶⠈⠉⠉⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣴⣿⡿⠛⢁⡈⠛⢿⣿⣦⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  Name of the Weapon: %1$s\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠿⣿⣦⣤⣈⠁⢠⣴⣿⠿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  Point of attack: %2$s\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠻⢿⣿⣦⡉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢷⣦⣈⠛⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣴⠦⠈⠙⠿⣦⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⣿⣤⡈⠁⢤⣿⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠛⠷⠄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⠑⢶⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠁⢰⡆⠈⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠳⠈⣡⠞⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀"
            },{
                "Potion",
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⣀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⡶⣋⠉⠉⠙⠷⠯⠉⠻⠏⠉⠓⠒⠲⠤⣤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⢿⡀⢻⠟⠙⠻⣶⡋⠉⠉⠲⡄⠀⠀⠀⠀⠀⠈⠉⠓⠶⢤⣀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⡟⣷⣟⠀⠀⠦⠈⠛⠦⠤⠴⠃⠀⠀⣴⠛⠉⠉⠓⢦⡀⣴⣮⣿⠶⣄⡀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⢿⠛⢯⣿⡋⠉⠓⢦⡀⠀⠀⠀⠀⠀⠘⠷⣄⣀⣀⣠⠷⠬⠙⠋⠀⢈⡙⢦⡀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣻⣿⡗⣦⣤⣤⣷⣄⡐⠂⠀⠐⢿⡶⣀⣭⣍⡁⠀⠀⢰⡞⠑⢦⣥⣤⣿⡆⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣤⣿⣿⣿⣿⢿⣯⣿⡜⠻⡀⠈⠙⠛⠶⢶⣦⣄⣀⣉⣉⠁⢀⡀⢤⣭⠙⢿⣆⣀⣼⡇⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡶⠋⣀⡌⣿⣿⣿⣷⣶⠁⠉⢁⡴⢦⡀⢀⠐⠀⣴⠋⠹⣏⠙⠛⢛⣛⡻⣾⠳⣾⣟⣹⣿⠟⠀⠀        Type of Potion: %1$s\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⠁⠀⣻⣧⡸⣿⣿⣿⣏⠀⠀⠸⣧⣼⠇⣘⣧⠀⠸⠦⠴⠏⠀⠸⣁⢀⣽⣼⣿⣿⢿⣿⡟⠀⠀⠀        Point of Regenerate: %2$s\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣴⣿⡁⠳⣕⠟⢽⡮⣻⣿⡻⢷⣶⣦⠟⢿⣿⠿⠒⠲⣥⣴⣤⢰⣶⡴⠿⣽⣿⣿⣛⣷⣤⠏⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⢀⣀⣀⣠⣤⣤⣤⣠⣤⣼⡟⠛⠈⢷⣌⣪⣃⠀⠀⠈⠁⠉⠛⠿⣿⣦⣾⢿⡀⠀⠀⢈⣿⣯⣽⣏⠀⠀⣸⡿⣿⣟⣿⣯⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⣠⣴⠿⠛⣹⢯⠟⠁⣠⢟⡵⢁⣼⣧⠈⣶⠟⣿⢻⣾⡓⢄⠀⠀⠀⠀⠀⠀⣈⣙⣓⣿⣷⣶⣋⣿⡿⣿⣿⣿⣿⣿⣿⣏⡿⠋⠀⢳⡄⠀⠀⠀\n" +
                    "⠀⠀⣰⠿⣇⢀⣰⣣⠏⣠⣾⣥⣿⣾⢟⣟⢹⢿⣯⠀⢀⣾⣧⠿⠶⢤⣀⠀⠀⠀⠈⠳⣀⡀⠀⠀⠉⠳⣌⠉⠉⣙⡿⠿⠻⠯⣄⠀⢀⣠⢺⡇⠀⠀⠀\n" +
                    "⠀⠀⡇⠀⢸⣩⠟⠛⢛⣡⣾⣿⢸⡇⡜⣽⣀⡼⢿⣿⣟⣁⠀⠀⢰⡶⠚⠛⠓⢦⣄⣀⡈⠙⠓⠲⠤⠴⠚⠀⠀⠻⠦⠤⠤⣴⣛⡰⣝⣣⣾⠃⠀⠀⠀\n" +
                    "⠀⠀⠻⠶⠟⠁⢀⡴⠛⢹⣿⣿⢸⣷⡿⣻⡽⠚⠉⠁⠀⠙⠺⣟⡉⠛⠛⣳⠖⠉⢉⡭⠛⠛⢻⣿⣵⣶⣶⣀⣀⣀⣤⣤⡬⣟⣻⣾⢿⣿⠁⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⣠⡶⢻⠁⠀⢨⣿⣿⣿⡽⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠉⠛⠻⢥⣤⡖⣉⡉⣉⣽⡿⠥⢀⣶⠟⠙⠑⣸⡋⢉⣭⡟⠃⠋⣹⡏⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⢰⡏⠙⢿⣆⣤⣿⣿⡷⠋⢀⣠⠶⠶⡴⠒⢲⣶⢒⣤⣤⣤⣤⣤⣤⣀⣉⡙⠛⠷⠦⢤⣤⣞⣥⣶⣶⣟⠱⢶⣲⣟⣲⡶⠟⠙⣷⡀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⣼⡄⠀⣸⠟⡽⣿⣯⢴⣏⣉⣷⣤⣤⣿⣶⠿⠛⠛⠻⣿⣿⣋⣙⣿⣿⣿⣿⣿⣿⣶⣦⢤⡴⢤⣀⣉⡉⠛⠋⠙⢯⠳⡄⠀⠀⠘⣿⡄⠀⠀⠀\n" +
                    "⠀⠀⣸⡟⠙⠛⢋⣼⣽⠗⠣⣤⡛⣻⣿⣿⠿⣿⢿⣶⣤⣤⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⣾⠉⠙⣿⠛⢲⣤⣤⣷⡹⡄⠀⠠⡘⣿⡄⠀⠀\n" +
                    "⠀⢰⣿⠁⠀⠀⡼⣽⣿⣦⣴⣯⣿⠋⠙⠻⣧⡻⣷⣝⣿⣿⣿⣿⣿⣿⣯⣟⠉⣹⣿⣿⣟⣿⣿⣿⣿⣿⣷⣾⣿⣤⣾⣿⣿⣿⣷⡹⡄⢠⢣⡘⣷⡀⠀\n" +
                    "⠀⣿⡇⠀⠀⣸⢳⣿⣿⡿⠛⠿⣿⣦⣤⣤⣿⣿⢿⣿⣿⣿⠿⠟⠛⠻⢿⣿⣽⣳⣿⣿⣿⣾⣿⣿⣿⣿⠿⢃⣼⣯⣿⣿⣿⣿⢹⣷⢷⡀⣏⣇⢻⣇⠀\n" +
                    "⢰⡿⠀⠀⢀⣇⣿⣿⣿⡀⠀⠀⣽⣿⣇⣀⣿⣹⣾⣋⢙⣧⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⠿⣷⣶⣷⣿⡿⠛⠙⢻⣻⣏⠿⣿⣿⡞⣇⣾⣸⠸⣿⠀\n" +
                    "⣼⡇⠀⠀⢸⢸⣿⢿⣿⣿⣶⣾⣿⣄⣽⣿⣿⣿⣯⣹⣿⣿⢾⣦⣀⣀⣰⣿⠀⠀⣻⠻⣿⠁⠀⠀⣿⣯⣭⣧⣀⣠⣼⣿⣿⣿⣿⣿⣇⢹⠋⡏⡆⣿⡄\n" +
                    "⣿⡇⠀⠀⢸⢸⣿⣀⣿⣿⣿⡿⢿⣿⣿⣿⢿⣟⠛⢻⣿⣇⠀⠈⢹⡉⠈⣿⣳⣾⠿⠾⢷⣷⣦⣾⣁⣹⣿⣿⣿⣿⣿⣿⡟⣿⣿⢿⣿⢸⠀⠘⡇⢸⡇\n" +
                    "⣿⡇⠀⠀⢸⢸⣿⣿⣿⣿⠿⣞⠉⠉⣉⡉⠳⣝⢷⡟⠁⠈⠹⣶⣿⢿⣻⡽⠟⠛⠓⠓⠓⠒⢯⣽⣻⢿⣿⣿⣿⠋⠀⠈⢳⣿⡟⣿⣿⢸⠀⠀⠃⣸⡇\n" +
                    "⢻⡇⠀⠀⢸⢸⣿⡄⣿⣿⣆⣉⠓⣾⡄⠈⢦⠸⡌⣷⣄⣠⣼⢯⡵⠋⠃⠉⠀⢀⣠⣴⠾⠽⠿⠯⠿⠷⣍⢿⣿⣷⣄⣴⣿⣿⣿⣿⡟⢸⠀⠀⠀⣿⠁\n" +
                    "⠘⣿⣀⠀⠘⡿⣿⣧⢹⣄⠙⢦⡻⢇⣹⡆⣼⢣⠇⣾⣷⣞⣿⠏⠁⡴⠂⠀⣴⣿⠃⠙⢦⣸⣤⣾⠀⠉⠺⢷⡙⣿⡟⢻⣿⣿⣿⣿⣇⡞⠀⠀⢰⣿⠀\n" +
                    "⠀⢿⣿⣣⠀⢳⣹⣿⡎⣿⣷⣌⠩⠽⢟⣿⠃⣼⢀⡟⣼⣿⠁⢠⠞⠁⠀⠀⣼⠗⠒⢲⣾⣉⣿⣿⣷⠇⠀⠘⣿⡹⣿⣿⠿⢿⣨⣿⣸⠃⠀⠀⣼⡇⠀\n" +
                    "⠀⠘⣿⣟⢇⡈⢯⢿⣿⡌⢿⣿⣦⣤⢸⡏⠀⡏⢸⠀⣏⡇⠀⣧⣀⣠⣔⣤⣿⡗⠒⠋⠿⣿⣿⣿⣿⠁⠀⣧⡏⡇⢹⡇⠀⠀⣽⢣⠇⠀⠀⢰⡿⠁⠀\n" +
                    "⠀⠀⠹⣿⣾⡱⡘⣮⢿⣿⣌⢿⣿⣿⡄⢹⡀⠻⣬⣃⣹⣻⡀⠉⢻⣿⠀⠀⠈⢳⣵⢄⡀⠁⢻⠀⢧⣀⣼⡟⠀⡇⢸⣿⣶⣾⢣⠟⠀⠀⢠⣿⠃⠀⠀\n" +
                    "⠀⠀⠀⢹⣿⢷⡵⡌⢯⡻⣿⣦⡹⣿⣿⡄⢳⡀⠀⠉⠉⡟⢧⣠⣾⠟⠀⠀⠀⠀⠙⠳⢽⣲⣦⣶⣶⠾⠋⠀⢀⡇⢸⣿⡿⣣⠏⠀⠀⢠⣿⠃⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠹⣷⡽⣘⢦⡻⣜⢿⣷⣬⣿⣿⣄⠳⣄⣀⡀⢻⡄⠰⡇⠀⠀⠀⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡰⣿⢁⣾⢋⡼⠁⠀⠀⣰⡿⠃⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠈⢿⣮⣧⣷⡌⠳⣝⣿⡏⠀⢈⣦⡈⠻⢿⣇⣻⣄⣙⠓⠒⢋⠖⣜⣞⡆⠀⠀⠀⠀⠀⠀⣀⣼⣥⢞⡵⠋⠀⠀⣠⣾⡟⠁⠀⠀⠀⠀⠀"
            },{
                "Shield",
            "                                                                                  \n" +
                    "                                        ▒▒▒▒                                      \n" +
                    "                                      ▒▒▒▒▒▒░░                                    \n" +
                    "                                  ▒▒▓▓▓▓▒▒▒▒▒▒▒▒░░                                \n" +
                    "                              ▒▒▒▒▓▓▒▒▓▓▒▒▒▒▒▒▒▒▒▒░░▒▒                            \n" +
                    "                            ▒▒▓▓▒▒▒▒▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░                          \n" +
                    "                        ▓▓▓▓▒▒▓▓▒▒▒▒▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░                      \n" +
                    "                    ▒▒▒▒▓▓▒▒▒▒▒▒▓▓▓▓▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░               Type of Potion: %1$s   \n" +
                    "                ▒▒▒▒▓▓▒▒▒▒▒▒▒▒▓▓████▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒░░▒▒▒▒▒▒▒▒▒▒▒▒░░           Point of Defence: %2$s   \n" +
                    "            ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒████████▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░▒▒▒▒▒▒░░          \n" +
                    "        ▒▒▒▒▓▓▒▒▒▒▒▒▒▒▓▓██████████████▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒      \n" +
                    "░░▓▓▓▓▓▓▒▒▒▒▒▒▒▒▓▓▓▓██████████████████▓▓████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░▒▒▒▒▒▒\n" +
                    "  ▓▓▒▒▒▒▒▒▒▒██████████████████▓▓▒▒▓▓▓▓██░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
                    "    ▒▒▒▒▒▒████▒▒▓▓████▒▒▓▓██▒▒▒▒██████░░░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒  \n" +
                    "    ▒▒▒▒▒▒████▒▒▓▓██▓▓▒▒▒▒▓▓▒▒▒▒████▒▒░░░░░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒  \n" +
                    "    ▒▒▒▒▒▒████▒▒▒▒▒▒▓▓▒▒██▓▓▓▓████▒▒████████▒▒▒▒░░▒▒▒▒░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒  \n" +
                    "    ▒▒▓▓▒▒▒▒▒▒████▓▓▒▒██████████▒▒▒▒▒▒██████▒▒░░░░░░▒▒▒▒▒▒▒▒▒▒░░▒▒▒▒▒▒░░▒▒▒▒░░▒▒  \n" +
                    "    ▒▒▓▓▒▒▒▒▒▒▓▓██████████████▒▒▒▒▒▒░░░░████░░░░░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░  \n" +
                    "      ▓▓▓▓▒▒▒▒▓▓▒▒██▓▓▓▓████████████████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▒▒░░▒▒▒▒▒▒▒▒    \n" +
                    "      ▓▓▒▒▒▒▒▒▒▒▓▓████████████████████▓▓████▒▒▒▒▓▓▓▓████████▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒░░    \n" +
                    "        ▒▒▒▒▒▒████████████████████████▓▓▓▓██▓▓▒▒▓▓▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒▒▒▒▒░░▒▒▒▒      \n" +
                    "        ▒▒▒▒▓▓▓▓████████████████████▓▓██████▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒      \n" +
                    "          ▓▓▒▒▒▒██████████████▓▓████▓▓████▓▓▒▒████▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒░░▒▒░░        \n" +
                    "          ▓▓▒▒▒▒████████▓▓██████████████████▒▒▒▒██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒        \n" +
                    "            ▒▒▒▒▓▓████▓▓▓▓▒▒██████████▓▓████▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░▒▒▒▒░░▒▒▒▒          \n" +
                    "              ▒▒▓▓▒▒▒▒▒▒▒▒██████████░░░░░░░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░            \n" +
                    "              ▓▓▒▒▒▒▒▒▒▒▒▒████████████░░░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░▒▒▒▒▒▒▒▒            \n" +
                    "                ▓▓▒▒▓▓▒▒▒▒██████████████░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░              \n" +
                    "                  ░░▓▓▒▒▒▒▒▒▒▒██████████▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░▒▒▒▒░░                \n" +
                    "                    ░░▓▓▒▒▒▒▒▒▓▓██████▓▓████▒▒▒▒▒▒▒▒▒▒▒▒░░▒▒▒▒                    \n" +
                    "                        ▓▓▒▒▒▒▒▒▒▒▓▓██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒                      \n" +
                    "                          ▒▒▓▓▒▒▒▒▒▒▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒                        \n" +
                    "                            ░░▒▒▓▓▒▒▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░                          \n" +
                    "                              ░░▓▓▒▒▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒░░                            \n" +
                    "                                    ░░▓▓▒▒▒▒▒▒░░                                  \n" +
                    "                                      ▒▒▒▒▒▒                                      \n"
    }
    }).collect(Collectors.toMap(data -> data[0], data -> data[1]));

    public static String get(String key){
        return map.get(key);
    }
}
