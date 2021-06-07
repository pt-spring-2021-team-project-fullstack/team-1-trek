package org.wcci.team1.trekproject;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Bad request. Trek not found!")
public class TrekNotFoundException {
}

