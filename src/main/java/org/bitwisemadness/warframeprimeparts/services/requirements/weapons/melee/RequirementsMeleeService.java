package org.bitwisemadness.warframeprimeparts.services.requirements.weapons.melee;

import org.bitwisemadness.warframeprimeparts.database.model.requirements.weapons.melee.RequirementsMelee;
import org.bitwisemadness.warframeprimeparts.database.repositories.requirements.weapons.melee.IRequirementsMeleeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RequirementsMeleeService implements IRequirementsMeleeService {
    @Autowired
    private IRequirementsMeleeRepository repository;


    @Override
    public List<RequirementsMelee> findAll() {
        return this.repository.findAll();
    }

    @Override
    public RequirementsMelee findByName(String name) {
        Optional<RequirementsMelee> optional = this.repository.findByName(name);
        return optional.orElse(null);
    }

    @Override
    public void put(RequirementsMelee requirements) {
        this.repository.save(requirements);
    }

    @Override
    public void putAll(List<RequirementsMelee> requirements) {
        requirements.forEach(this::put);
    }

    @Override
    public void delete(String name) {
        Optional<RequirementsMelee> optional = this.repository.findByName(name);
        optional.ifPresent(melee -> this.repository.delete(melee));
    }
}
