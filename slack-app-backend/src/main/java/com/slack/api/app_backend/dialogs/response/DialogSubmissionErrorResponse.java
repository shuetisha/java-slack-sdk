package com.slack.api.app_backend.dialogs.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @see <a href="https://api.slack.com/dialogs">Dialogs</a>
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DialogSubmissionErrorResponse {

    private List<Error> errors;

}
