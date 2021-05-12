package Tiger013

import Tiger013.buildTypes.*
import Tiger013.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger013")
    name = "Tiger013"

    vcsRoot(Tiger013_cVCSroot)

    buildType(Tiger013_Hi2)
    buildType(Tiger013_Hi1)
    buildType(Tiger013_Hi3)
    buildType(Tiger013_Hi0)

    subProject(Tiger01327.Project)
    subProject(Tiger01349.Project)
    subProject(Tiger01328.Project)
    subProject(Tiger01329.Project)
    subProject(Tiger01323.Project)
    subProject(Tiger01345.Project)
    subProject(Tiger01324.Project)
    subProject(Tiger01346.Project)
    subProject(Tiger01325.Project)
    subProject(Tiger01347.Project)
    subProject(Tiger01326.Project)
    subProject(Tiger01348.Project)
    subProject(Tiger01341.Project)
    subProject(Tiger01320.Project)
    subProject(Tiger01342.Project)
    subProject(Tiger01321.Project)
    subProject(Tiger01343.Project)
    subProject(Tiger01322.Project)
    subProject(Tiger01344.Project)
    subProject(Tiger01340.Project)
    subProject(Tiger01316.Project)
    subProject(Tiger01338.Project)
    subProject(Tiger01317.Project)
    subProject(Tiger01339.Project)
    subProject(Tiger01318.Project)
    subProject(Tiger01319.Project)
    subProject(Tiger01312.Project)
    subProject(Tiger01334.Project)
    subProject(Tiger01313.Project)
    subProject(Tiger01335.Project)
    subProject(Tiger01314.Project)
    subProject(Tiger01336.Project)
    subProject(Tiger01315.Project)
    subProject(Tiger01337.Project)
    subProject(Tiger01330.Project)
    subProject(Tiger01331.Project)
    subProject(Tiger01310.Project)
    subProject(Tiger01332.Project)
    subProject(Tiger01311.Project)
    subProject(Tiger01333.Project)
})
