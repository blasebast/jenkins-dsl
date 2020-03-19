job('my-test-job') {
    description 'self-test.'
    scm {
        github 'blasebast/jenkins-dsl'
    }
    steps {
        shell 'mkdir -p test-results && echo "<simple>content</simple>" > test-results/report.xml '
    }
    publishers {
        archiveJunit 'build/test-results/**/*.xml'
    }
}
        