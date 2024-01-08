package com.example.demo;

import org.junit.platform.launcher.Launcher;
import org.junit.platform.launcher.LauncherDiscoveryRequest;
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder;
import org.junit.platform.launcher.core.LauncherFactory;
import org.junit.platform.launcher.listeners.SummaryGeneratingListener;
import org.junit.platform.launcher.listeners.TestExecutionSummary;

import static org.junit.platform.engine.discovery.DiscoverySelectors.selectClass;

public class MesesAnoMain {
    public static void main(String[] args) {
        LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder.request()
                .selectors(selectClass(MesesDelAnoTest.class))
                .build();

        Launcher launcher = LauncherFactory.create();

        // Listener para generar un resumen de las pruebas
        SummaryGeneratingListener listener = new SummaryGeneratingListener();

        launcher.registerTestExecutionListeners(listener);
        launcher.execute(request);

        // Obteniendo el resumen
        TestExecutionSummary summary = listener.getSummary();

        // Mensaje personalizado basado en los resultados de las pruebas
        System.out.println("Total de pruebas ejecutadas: " + summary.getTestsFoundCount());
        System.out.println("Total de pruebas exitosas: " + summary.getTestsSucceededCount());
        System.out.println("Total de pruebas fallidas: " + summary.getTestsFailedCount());

        if (summary.getTestsFailedCount() > 0) {
            System.out.println("Algunas pruebas han fallado.");
        } else {
            System.out.println("Todas las pruebas han pasado exitosamente.");
        }
    }
}


