package Tiger0442

import Tiger0442.buildTypes.*
import Tiger0442.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0442")
    name = "Tiger0442"

    vcsRoot(Tiger0442_cVCSroot)

    buildType(Tiger0442_Hi3)
    buildType(Tiger0442_Hi2)
    buildType(Tiger0442_Hi1)
    buildType(Tiger0442_Hi0)
})
