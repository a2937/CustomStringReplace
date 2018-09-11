package com.example.a2937;

/**
 * A helper class that replaces characters
 * in strings.
 */
public class StringReplacer
{
    /**
     * A static method that replaces
     * a character in an input string with
     * replacement. If the string is null
     * or empty, then an empty string is returned.
     *
     * @param input   the input string
     * @param oldChar the old character
     * @param newChar the new character
     * @return a string with the characters replaced
     *
     */
    public static String ReplaceCharacter(String input, char oldChar, char newChar)
    {
        StringBuilder builder = new StringBuilder();

        if(input != null && !input.isEmpty())
        {
            for (char currentCharacter: input.toCharArray())
            {
                if(currentCharacter == oldChar)
                {
                    builder.append(newChar);
                }
                else
                {
                    builder.append(currentCharacter);
                }
            }
            return builder.toString();

        }
        else
        {
            return "";
        }
    }

}
