package Tiger01442

import Tiger01442.buildTypes.*
import Tiger01442.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01442")
    name = "Tiger01442"

    vcsRoot(Tiger01442_cVCSroot)

    buildType(Tiger01442_Hi3)
    buildType(Tiger01442_Hi2)
    buildType(Tiger01442_Hi1)
    buildType(Tiger01442_Hi0)
})
