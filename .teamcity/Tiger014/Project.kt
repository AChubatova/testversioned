package Tiger014

import Tiger014.buildTypes.*
import Tiger014.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger014")
    name = "Tiger014"

    vcsRoot(Tiger014_cVCSroot)

    buildType(Tiger014_Hi3)
    buildType(Tiger014_Hi2)
    buildType(Tiger014_Hi1)
    buildType(Tiger014_Hi0)

    subProject(Tiger01427.Project)
    subProject(Tiger01449.Project)
    subProject(Tiger01426.Project)
    subProject(Tiger01448.Project)
    subProject(Tiger01429.Project)
    subProject(Tiger01428.Project)
    subProject(Tiger01423.Project)
    subProject(Tiger01445.Project)
    subProject(Tiger01422.Project)
    subProject(Tiger01444.Project)
    subProject(Tiger01425.Project)
    subProject(Tiger01447.Project)
    subProject(Tiger01424.Project)
    subProject(Tiger01446.Project)
    subProject(Tiger01441.Project)
    subProject(Tiger01440.Project)
    subProject(Tiger01421.Project)
    subProject(Tiger01443.Project)
    subProject(Tiger01420.Project)
    subProject(Tiger01442.Project)
    subProject(Tiger01419.Project)
    subProject(Tiger01416.Project)
    subProject(Tiger01438.Project)
    subProject(Tiger01415.Project)
    subProject(Tiger01437.Project)
    subProject(Tiger01418.Project)
    subProject(Tiger01417.Project)
    subProject(Tiger01439.Project)
    subProject(Tiger01412.Project)
    subProject(Tiger01434.Project)
    subProject(Tiger01411.Project)
    subProject(Tiger01433.Project)
    subProject(Tiger01414.Project)
    subProject(Tiger01436.Project)
    subProject(Tiger01413.Project)
    subProject(Tiger01435.Project)
    subProject(Tiger01430.Project)
    subProject(Tiger01410.Project)
    subProject(Tiger01432.Project)
    subProject(Tiger01431.Project)
})
