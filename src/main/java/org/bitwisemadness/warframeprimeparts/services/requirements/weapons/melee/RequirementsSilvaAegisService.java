package org.bitwisemadness.warframeprimeparts.services.requirements.weapons.melee;

import org.bitwisemadness.warframeprimeparts.database.model.requirements.weapons.melee.RequirementsSilvaAegis;
import org.bitwisemadness.warframeprimeparts.database.repositories.requirements.weapons.melee.IRequirementsSilvaAegisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RequirementsSilvaAegisService implements IRequirementsSilaAegisService {
    @Autowired
    private IRequirementsSilvaAegisRepository repository;


    @Override
    public List<RequirementsSilvaAegis> findAll() {
        return this.repository.findAll();
    }

    @Override
    public RequirementsSilvaAegis findByName(String name) {
        Optional<RequirementsSilvaAegis> optional = this.repository.findByName(name);
        return optional.orElse(null);
    }

    @Override
    public void put(RequirementsSilvaAegis requirements) {
        this.repository.save(requirements);
    }

    @Override
    public void putAll(List<RequirementsSilvaAegis> requirements) {
        requirements.forEach(this::put);
    }

    @Override
    public void delete(String name) {
        Optional<RequirementsSilvaAegis> optional = this.repository.findByName(name);
        optional.ifPresent(silvaAegis -> this.repository.delete(silvaAegis));
    }
}
