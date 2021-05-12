package Tiger01029

import Tiger01029.buildTypes.*
import Tiger01029.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01029")
    name = "Tiger01029"

    vcsRoot(Tiger01029_cVCSroot)

    buildType(Tiger01029_Hi0)
    buildType(Tiger01029_Hi3)
    buildType(Tiger01029_Hi2)
    buildType(Tiger01029_Hi1)
})
