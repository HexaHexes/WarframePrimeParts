package org.bitwisemadness.warframeprimeparts.services.requirements.frames;

import org.bitwisemadness.warframeprimeparts.database.model.requirements.frames.RequirementsWarframe;
import org.bitwisemadness.warframeprimeparts.database.repositories.requirements.frames.IRequirementsWarframeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RequirementsWarframeService implements IRequirementsWarframeService {
    @Autowired
    private IRequirementsWarframeRepository repository;


    @Override
    public List<RequirementsWarframe> findAll() {
        return this.repository.findAll();
    }

    @Override
    public RequirementsWarframe findByName(String name) {
        Optional<RequirementsWarframe> optional = this.repository.findByName(name);
        return optional.orElse(null);
    }

    @Override
    public void put(RequirementsWarframe requirements) {
        this.repository.save(requirements);
    }

    @Override
    public void putAll(List<RequirementsWarframe> requirements) {
        requirements.forEach(this::put);
    }

    @Override
    public void delete(String name) {
        Optional<RequirementsWarframe> optional = this.repository.findByName(name);
        optional.ifPresent(warframe -> this.repository.delete(warframe));
    }
}
