package br.com.connectpeople.api.resource;

import br.com.connectpeople.api.request.ResumeRequest;
import br.com.connectpeople.resume.domain.Resume;
import br.com.connectpeople.resume.usecase.RegisterResumeUseCase;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static br.com.connectpeople.resume.domain.constants.Constants.StateProcess.NEW;
import static br.com.connectpeople.resume.domain.constants.Constants.StateProcess.SUCCESS;

@Log4j2
@AllArgsConstructor
@RestController
@RequestMapping("/api/resume")
public class ResumeRestResource {

    private final RegisterResumeUseCase registerResumeUseCase;

    @PostMapping
    public Resume register(@RequestBody ResumeRequest request) {
        log.info("M register, request={}, state={}", request, NEW);
        Resume execute = registerResumeUseCase.execute(request.toResume());
        log.info("M register, request={}, state={}", execute, SUCCESS);
        return execute;
    }

}
