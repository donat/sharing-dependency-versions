package com.example;

import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.integration.SimpsonIntegrator;
import org.apache.commons.math3.analysis.integration.UnivariateIntegrator;

public class IntegralSample {
    public double calculate() {
        UnivariateFunction function = v -> v;
        UnivariateIntegrator integrator = new SimpsonIntegrator(1.0e-12, 1.0e-8, 1, 32);
        return integrator.integrate(100, function, 0, 10);
    }
}
