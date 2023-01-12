package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter@Getter@AllArgsConstructor@NoArgsConstructor
public class Feedback
{
    Integer FeedbackId;
    Integer FeedbackClientId;
    String FeedbackType;
    String FeedbackDescription;
}
