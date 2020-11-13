package org.bitwisemadness.warframeprimeparts.services.requirements.companions;

import org.bitwisemadness.warframeprimeparts.database.model.requirements.companions.RequirementsSentinel;
import org.bitwisemadness.warframeprimeparts.database.repositories.requirements.companions.IRequirementsSentinelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RequirementsSentinelService implements IRequirementsSentinelService {
    @Autowired
    private IRequirementsSentinelRepository repository;


    @Override
    public List<RequirementsSentinel> findAll() {
        return this.repository.findAll();
    }

    @Override
    public RequirementsSentinel findByName(String name) {
        Optional<RequirementsSentinel> optional = this.repository.findByName(name);
        return optional.orElse(null);
    }

    @Override
    public void put(RequirementsSentinel requirements) {
        this.repository.save(requirements);
    }

    @Override
    public void putAll(List<RequirementsSentinel> requirements) {
        requirements.forEach(this::put);
    }

    @Override
    public void delete(String name) {
        Optional<RequirementsSentinel> optional = this.repository.findByName(name);
        optional.ifPresent(collar -> this.repository.delete(collar));
    }
}
