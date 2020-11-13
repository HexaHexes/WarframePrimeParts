package org.bitwisemadness.warframeprimeparts.rest.requirements.companions;

import com.sun.istack.NotNull;
import org.bitwisemadness.warframeprimeparts.database.model.requirements.companions.RequirementsSentinel;
import org.bitwisemadness.warframeprimeparts.services.requirements.companions.IRequirementsSentinelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/requirements/sentinel", produces = MediaType.APPLICATION_JSON_VALUE)
public class RequirementsSentinelRestController {
    @Autowired
    private IRequirementsSentinelService service;

    @GetMapping("/find-all")
    public List<RequirementsSentinel> findAll() {
        return this.service.findAll();
    }

    @GetMapping("/find-by-name")
    public RequirementsSentinel findByName(@RequestBody @NotNull String name) {
        return this.service.findByName(name);
    }

    @PutMapping("/put")
    public void put(@RequestBody @NotNull RequirementsSentinel collar) {
        this.service.put(collar);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody @NotNull String name) {
        this.service.delete(name);
    }
}
