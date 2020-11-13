package org.bitwisemadness.warframeprimeparts.services.requirements.companions;

import org.bitwisemadness.warframeprimeparts.database.model.requirements.companions.RequirementsCollar;
import org.bitwisemadness.warframeprimeparts.database.repositories.requirements.companions.IRequirementsCollarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RequirementsCollarService implements IRequirementsCollarService {
    @Autowired
    private IRequirementsCollarRepository repository;


    @Override
    public List<RequirementsCollar> findAll() {
        return this.repository.findAll();
    }

    @Override
    public RequirementsCollar findByName(String name) {
        Optional<RequirementsCollar> optional = this.repository.findByName(name);
        return optional.orElse(null);
    }

    @Override
    public void put(RequirementsCollar requirements) {
        this.repository.save(requirements);
    }

    @Override
    public void putAll(List<RequirementsCollar> requirements) {
        requirements.forEach(this::put);
    }

    @Override
    public void delete(String name) {
        Optional<RequirementsCollar> optional = this.repository.findByName(name);
        optional.ifPresent(collar -> this.repository.delete(collar));
    }
}
